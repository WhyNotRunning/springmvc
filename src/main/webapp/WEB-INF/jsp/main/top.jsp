<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglibs/taglibs.jsp"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>top</title>

</head>

<body>

	<div id="header">
        
        <div class="logo"></div>
        <div class="admin_nav">
        	<ul>
            </ul>
        </div>
        <div class="welcome"><shiro:principal/>&nbsp;&nbsp;你好，欢迎登录！&nbsp;&nbsp;[&nbsp;<a href="${ctx}/logout" target="_parent" class="white underline">退出</a>&nbsp;]</div>

	</div>
    
</body>


</html>
