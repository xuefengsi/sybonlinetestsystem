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
        <a href="${pageContext.request.contextPath}/index.jsp">退出</a>
    </div>

    <div id="clearFloat">
        <hr>
    </div>

    <div id="content">
        <div id="leftNav">
            <div id="mainMenu">
                <span>主菜单</span>
            </div>
            <div id="menuNav">
                <ul>
                    <form action="http://localhost:8080/sybonlinetestsystem_war_exploded/syb_online_test/gradeManage.action" method="get" target="iframe_a" name="gradeManage_form">
                        <li><a href="javascript:document:gradeManage_form.submit();" name="category">成绩管理</a></li>
                    </form>
                    <form action="http://localhost:8080/sybonlinetestsystem_war_exploded/syb_online_test/studentManage.action" method="get" target="iframe_a" name="studentManage_form">
                        <li><a href="javascript:document:studentManage_form.submit();" target="iframe_a">学生管理</a></li>
                    </form>
                    <form action="http://localhost:8080/sybonlinetestsystem_war_exploded/syb_online_test/testManage.action" method="get" target="iframe_a" name="testManage_form">
                        <li><a href="javascript:document:testManage_form.submit();" target="iframe_a">考试管理</a></li>
                    </form>
                </ul>
            </div>

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
