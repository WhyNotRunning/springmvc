<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglibs/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>OA系统</title>
</head>

<frameset rows="69,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="${ctx}/top" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" title="topFrame" />
  <frameset rows="*" cols="195,*" framespacing="0" frameborder="no" border="0">
    <frame src="${ctx}/nav" name="navFrame" scrolling="yes" noresize="noresize" id="navFrame" title="leftFrame" />
    <frame src="${ctx}/welcome" name="mainFrame" id="mainFrame" title="mainFrame" />
  </frameset>
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>
