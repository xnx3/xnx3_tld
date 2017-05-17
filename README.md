# xnx3_tld
常用tld标签，如时间戳转时间描述，字符串剪切等

## 使用前提
### JSP页面顶部引入 
````Java
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
````

### 将JSP页面上获取到的10位/13位时间戳转化为 月-日 时:分 显示出来
````Java
<x:time linuxTime="${log.logtime }" format="MM-dd HH:mm"></x:time>
````

### 将JSP页面上某数据，最多只输出前三个字符，若有超出的末尾加..
````Java
<x:substring maxLength="3" text="${log.text}" more=".."></x:substring>
````

### 将JSP页面上的 192382081 Byte 转化为文字描述的空间大小，输出183.47 MB
````Java
<x:fileSizeToInfo size="${log.size}"></x:fileSizeToInfo>
````
