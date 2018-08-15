<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<jsp:include page="../main.jsp" />

    <h2> 상품 목록 </h2>
<table>
    <tr>
        <th>상품번호</th>
        <th>상품이미지</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>

    <c:forEach var="list" items="${list}">
        <tr>
            <td>
                ${list.id}
            </td>
            <td>
                <a href="${path}/detail/${list.id}">
                    <img src="${path}/images/${list.url}">
                </a>
            </td>
            <td>
                ${list.name}
            </td>
            <td>
                <fmt:formatNumber value="${list.price}" pattern="###,###,###" />
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>