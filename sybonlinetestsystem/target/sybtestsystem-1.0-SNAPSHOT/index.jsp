<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户登录</title>
</head>
<body style="text-align: center">
    <img src="" height="600" width="100%" />
    <form action="http://localhost:8080/sybonlinetestsystem_war_exploded/login/test.action" method="post">
        <div style="margin: 0 auto">
            <label>用户名：</label>
            <input type="text" />
            <label>密  码：</label>
            <input type="password" />
            <input type="submit" value="登 录" style="display: inline-block; width: 100px" />
        </div>
    </form>
</body>
</html>