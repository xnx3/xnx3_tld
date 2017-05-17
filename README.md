# xnx3_tld
常用tld标签，如时间戳转时间描述，字符串剪切等

## 使用前提：
JSP页面顶部引入 
````Java
<%@ taglib uri="http://www.xnx3.com/java_xnx3/xnx3_tld" prefix="x" %>
````

## 将JSP页面上获取到的10位/13位时间戳转化为月日：时分显示出来
````Java
<x:time linuxTime="${log.logtime }" format="MM-dd HH:mm"></x:time>
````
