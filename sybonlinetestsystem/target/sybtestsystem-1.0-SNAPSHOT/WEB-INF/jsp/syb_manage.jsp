<%--
  Created by IntelliJ IDEA.
  User: SoraHoro
  Date: 2019/3/12 0012
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>SYB创业培训管理系统</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/syb_manage.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/syb_manage.css">
</head>
<body>
    <div id="syb_manage_top">
        <img src="" width="100%" height="100">
    </div>

    <div style="height: 30px;background-color: #0a73a7">
        <span style="color: white">欢迎【${admin.name}】登录SYB考试管理系统</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value="退出" style="display: inline-block;width: 40px;height: 30px">
    </div>

    <div id="clearFloat">
        <hr>
    </div>

    <div id="content">
        <div id="leftNav">
            <div id="mainMenu">
                <span>主菜单</span>
            </div>
            <form action="" method="get">
                <div id="menuNav">
                    <ul>
                        <li><a href="" target="iframe_a">成绩管理</a></li>
                        <li><a href="" target="iframe_a">学生管理</a></li>
                        <li><a href="" target="iframe_a">考试管理</a></li>
                    </ul>
                </div>
            </form>
        </div>

        <div id="forInterval">

        </div>

        <div id="rightNav">
            <div id="ownFrame">
                <span>SYB后台管理</span>
            </div>
            <iframe src="" name="iframe_a" style="width: 80%;height: 750px"></iframe>
        </div>

    </div>
</body>
</html>
