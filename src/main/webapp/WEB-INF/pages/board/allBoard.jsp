<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>게시판</title>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>
<button type="button" onclick="location.href='/'">메인으로가기</button>
<br>
앞으로 게시판을 만들 예정
기능 (등록, 삭제, 읽기, 수정)
+ 댓글 (같음)
<br><br><br>
<center>
    <button type="button" onclick="location.href='/newBoard'">글쓰기</button>
<table>
    <tr>
        <td>번호</td>
        <td>제목</td>
        <td>날짜</td>
    </tr>
    <c:forEach var="board" items="${board}">
    <tr>
        <td>${board.boardNum}</td>
        <td><a href="board/${board.boardNum}">${board.title}</a></td>
        <td>${board.regDate}</td>
    </tr>
    </c:forEach>
</table>
</center>
</body>
</html>