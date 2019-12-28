<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head> <title>打印</title> </head>
<body>


<table table-layout: fixed; width: 623px align="center" cellpadding="0" border="1">
    <colgroup>
        <col style="width: 129px">
        <col style="width: 145px">
        <col style="width: 164px">
        <col style="width: 185px">
    </colgroup>
    <tr>
        <th  colspan="4">***计算机服务有限公司取机凭证***</th>
    </tr>
    <tr>
        <td >接修日期</td>
        <td >${requestScope.time}</td>
        <td >维修编号：</td>
        <td >${requestScope.id}</td>
    </tr>
    <tr>
        <td >产品类型</td>
        <td >${requestScope.type}</td>
        <td >机器品牌</td>
        <td >${requestScope.pinpai}</td>
    </tr>
    <tr>
        <td >机器型号</td>
        <td >${requestScope.machin}</td>
        <td >系列号</td>
        <td >${requestScope.xilie}</td>
    </tr>
    <tr>
        <td >单位名称</td>
        <td >${requestScope.danwei}</td>
        <td >联系人</td>
        <td >${requestScope.tele}</td>
    </tr>
    <tr>
        <td >机器故障现象</td>
        <td >${requestScope.xianxiang}</td>
        <td ></td>
        <td ></td>
    </tr>
    <tr>
        <td >缺少零件</td>
        <td>${requestScope.lingjian}</td>
        <td >随机附件</td>
        <td>${requestScope.suiji}</td>
    </tr>
<%--    <tr>--%>
<%--        <td ></td>--%>
<%--        <td ></td>--%>
<%--    </tr>--%>
</table>
<form action="${pageContext.request.contextPath }/checkprint" method="post">

</form>
</body>
</html>
