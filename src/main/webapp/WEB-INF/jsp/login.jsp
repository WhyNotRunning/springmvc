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
    <meta name="_csrf" content="${csrfToken}"/>
	<!-- default header name is X-CSRF-TOKEN -->
	<meta name="_csrf_header" content="${csrfHeaderName}"/>
    <%-- <link rel="icon" href="${ctx}/assets/image/default_avatar.jpg"> --%>

    <title>登陆页面</title>

    <!-- Bootstrap core CSS -->
    <link href="${ctx}/assets/css/bootstrap-3.3.5/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="${ctx}/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${ctx}/assets/css/signin.css" rel="stylesheet">

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

    <div class="container">

      <form class="form-signin" method="post" action="">
        <h2 class="form-signin-heading">请登陆</h2>
			<span style="color:red; height: 30px;">${msg}</span>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" name="username" id="username" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" name="rememberMe" value="true"> 记住密码
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="button" onclick="login();">登陆</button>
      </form>

    </div> <!-- /container -->

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${ctx}/assets/js/ie10-viewport-bug-workaround.js"></script>
    <script src="${ctx}/assets/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript">
    $(function () {
    	var token = $("meta[name='_csrf']").attr("content");
    	var header = $("meta[name='_csrf_header']").attr("content");
    	$(document).ajaxSend(function(e, xhr, options) {
    		xhr.setRequestHeader(header, token);
    	});
    });
    function login(){
    	  $.ajax({
    	        type: "POST",
    	        cache: false,
    	        url: "",
    	        data: {username:$("#username").val(),password:$("#password").val()},
    	        dataType:"json",
    	        async: true,
    	        error: function(data, error) {},
    	        success: function(data)
    	        {
    	            console.log("login success");
    	        }
    	    });
    }
    </script>
  </body>
</html>
