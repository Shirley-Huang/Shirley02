<%--
  Created by IntelliJ IDEA.
  User: dandan
  Date: 2019-06-12
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

<h2>Hello World! <h5>欢迎来到登录页面</h5></h2>
<form action="/login" method="post" id="loginIn" name="loginForm" onsubmit="return checkLoginParam(this)">
    <table>
        <thead>登陆</thead>
        <tr>
            <td>账号</td>
            <%--        autofocus属性规定在页面加载时，域自动地获得焦点--%>
            <td><input type="text" id="accountName" name="accountName" autofocus="autofocus"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" id="passwd" name="password"/></td>
        </tr>
    </table>
    <input type="submit" value="登录"/>
</form>

<script type="text/javascript">
    function checkLoginParam(loginForm) {
        if(document.loginForm.accountName.value == "") {
            alert("用户名不能为空");
            return false;
        }
        if(document.loginForm.password.value == ""){
            alert("密码不能为空");
            return false;
        }
        var str = document.loginForm.accountName.value + ":" + document.loginForm.accountName.value;
        alert(str);

        return true;
    }
</script>


</body>
</html>
