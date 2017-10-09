package com.xnx3.tld;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 调用语言包显示
 * <br/>已弃用
 * <br/>需配合iw.jar ( https://github.com/xnx3/iw )
 * @author 管雷鸣
 * @deprecated
 */
public class Language extends TagSupport {
	private String key;		//要调用的语言文字的key值
	private String remark;	//备注，程序中无任何作用，只是给开发人员自己看
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public int doEndTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		try {
			writer.print(Global.getLanguage(key));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
	
}
