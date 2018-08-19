<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<jsp:include page="../main.jsp" />

<h2> 회원 목록 </h2>
<table>
    <tr>
        <th>아이디</th>
        <th>이름</th>
        <th>메인주소</th>
    </tr>

    <c:forEach var="list" items="${list}">
        <tr>
            <td> ${list.id}</td>
            <td> <a href="/users/view?id=${list.id}"> ${list.name}</a></td>
            <td> ${list.mainAddr}</td>
        </tr>

    </c:forEach>

</table>
</body>
</html>