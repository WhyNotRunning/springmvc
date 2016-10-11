<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/taglibs/taglibs.jsp"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <%-- <link rel="icon" href="${ctx}/assets/image/default_avatar.jpg"> --%>

    <title>主界面</title>

    <!-- Bootstrap core CSS -->
    <link href="${ctx}/assets/css/bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="${ctx}/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${ctx}/assets/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${ctx}/assets/css/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="${ctx}/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
	<div id="wrapper">
        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
			<%@include file="main/nav.jsp"%>
		</nav>
		<div id="page-wrapper">
		</div>
	</div>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${ctx}/assets/js/ie10-viewport-bug-workaround.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="${ctx}/assets/js/sb-admin-2.js"></script>
  </body>
</html>
