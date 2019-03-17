<%--
  Created by IntelliJ IDEA.
  User: SoraHoro
  Date: 2019/3/17 0017
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>SYB成绩管理</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/grade_manage.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/grade_manage.css">
</head>
<body>
    <div id="search_div">
        <form action="http://localhost:8080/sybonlinetestsystem_war_exploded/syb_online_test/gradeManageFilter.action" method="get">
            <label>学号</label>
            <input type="text" style="display: inline;width: 50px" name="studentNumber">
            <label>姓名</label>
            <input type="text" style="display: inline;width: 50px" name="studentName">
            <label>年级</label>
            <input type="text" style="display: inline;width: 50px" name="grade">
            <label>分数</label>
            <input type="text" style="display: inline;width: 30px" name="minScore">
            <label>——</label>
            <input type="text" style="display: inline;width: 30px" name="maxScore">
            <input type="submit" style="display: inline" value="搜索">
        </form>
    </div>
    <div id="table_div">
        <table>
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年级</th>
                <th>院系</th>
                <th>成绩</th>
                <th>所属教师</th>
                <th>操作</th>
            </tr>
            <c:if test="${dataList == null || fn:length(dataList) == 0}">
                <tr>
                    <td>暂时还没有数据</td>
                </tr>
            </c:if>

            <c:forEach items="${dataList}" var="data" varStatus="status">
                <tr>
                    <td>${data.studentNumber}</td>
                    <td>${data.studentName}</td>
                    <td>${data.gender}</td>
                    <td>${data.studentGrade}</td>
                    <td>${data.department}</td>
                    <td>${data.score}</td>
                    <td>${data.belongTeacher}</td>
                    <td>操作</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
