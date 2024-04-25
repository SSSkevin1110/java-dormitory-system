<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>注册界面</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">    <!-- 引入 font-awesome -->
    <!-- 引入 font-awesome -->
    <link href="https://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/style.css">
</head>

<body>
<div class="container">
    <div class="form row">
        <form class="form-horizontal" id="register_form" action="${pageContext.request.contextPath}/account/register" method="post">
            <h3 class="form-title">注册账号</h3>
            <div class="form-group">
                <label for="username" class="control-label">用户名:</label>
                <input class="form-control" id="username" name="username" required placeholder="请输入用户名" type="text">
            </div>
            <div class="form-group">
                <label for="password" class="control-label">密码:</label>
                <input class="form-control" id="password" name="password" required placeholder="请输入密码" type="password">
            </div>
            <div class="form-group">
                <label for="confirmPassword" class="control-label">确认密码:</label>
                <input class="form-control" id="confirmPassword" name="confirmPassword" required placeholder="请再次输入密码" type="password">
            </div>
            <div class="form-group">
                <label class="radio-inline">
                    <input type="radio" name="type" value="systemAdmin" checked> 系统管理员
                </label>
                <label class="radio-inline">
                    <input type="radio" name="type" value="dormitoryAdmin"> 宿舍管理员
                </label>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary">注册</button>
                <button type="reset" class="btn btn-default">重置</button>
            </div>
            <!-- 在表单下方添加一个返回登录页面的链接 -->
            <div class="form-group">
                <a href="${pageContext.request.contextPath}/login.jsp" class="btn btn-link">已有账号？返回登录</a>
            </div>

        </form>
    </div>
</div>
</body>
</html>
