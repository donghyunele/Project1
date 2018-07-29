<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시판</title>
</head>
<body>
앞으로 게시판을 만들 예정
기능 (등록, 삭제, 읽기, 수정)
+ 댓글 (같음)
<center>
<table>
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>날짜</td>
        <td>조회수</td>
    </tr>
    <c:forEach var="board" items="${board}">
    <tr>
        <td>${board.boardNum}</td>
        <td>${board.title}</td>
        <td>${board.regDate}</td>
        <td>${board.readCount}</td>
    </tr>
    </c:forEach>
</table>
</center>
</body>
</html>