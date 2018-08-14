<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<jsp:include page="../main.jsp" />

    <h2> 상품 목록 </h2>
<tabe>
    <tr>
        <th>상품번호</th>
        <th>상품이미지</th>
        <th>상품명</th>
        <th>가격</th>
    </tr>
    <c:forEach var="row" items="${list}">
        <tr>
            <td>
                ${row.Id}
            </td>
            <td>
                <a href="${path}/detail/${row.Id}">
                    <img src="${path}/images/${row.Url}">
                </a>
            </td>
            <td>
                ${row.Name}
            </td>
            <td>
                <fmt:formatNumber value="${row.Price}" pattern="###,###,###" />
            </td>
        </tr>
    </c:forEach>
</tabe>
</body>
</html>