<%--
  Created by IntelliJ IDEA.
  User: 92135
  Date: 2019/7/11
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/FlowProcess" method="post">
    维修编号:       <input type="text" name="rn"><br/>
    <input type="submit" value="添加">
</form>
</body>
</html>
