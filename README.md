# xnx3_tld
jsp页面常用tld标签，如时间戳转时间描述，字符串限定输出长度等，引入Jar包，直接就可在jsp页面中使用，方便快捷！


## 1. 使用前提
##### 1.1 项目中导入jar包： xnx3.jar 、 xnx3_tld.jar
##### 1.2 JSP页面顶部引入 
````Java
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
````


## 2. JSP页面中标签功能及使用说明
##### 将10位/13位时间戳转化为 月-日 时:分 显示出来
````Java
<x:time linuxTime="${log.logtime }" format="MM-dd HH:mm"></x:time>
````

##### 字符串最多只输出前3个字符，若有超出的末尾加..
````Java
<x:substring maxLength="3" text="${log.text}" more=".."></x:substring>
````

##### 将 192382081 Byte 转化为文字描述的空间大小，输出183.47 MB， 会自动换算GB、MB、KB，保留两位小数
````Java
<x:fileSizeToInfo size="${log.size}"></x:fileSizeToInfo>
````

##### 判断给图片统一做绝对路径处理。若是相对路径，自动加上绝对路径的前缀网址
````Java
<x:imgUrl img="abc.jpg" prefixUrl="http://www.xnx3.com/"></x:imgUrl>
````
