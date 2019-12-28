<%--
  Created by IntelliJ IDEA.
  User: 92135
  Date: 2019/7/11
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/FlowInsert" method="post">
    备件名称:       <input type="text" name="rn"><br/>
    型号:       <input type="text" name="cn"><br/>
    维修编号:       <input type="text" name="pt"><br/>
    数量:       <input type="text" name="mb"><br/>
    单价        <input type="text" name="mt"><br/>
    <input type="submit" value="添加">
</form>
</body>
</html>
