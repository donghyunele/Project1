<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <link rel="stylesheet" href="/css/main.css">
</head>
<body>

<center>
    <table>
        <tr>
            <td colspan="2"><h2> 게시글 번호 : ${oneBoard.boardNum} </h2></td>
        </tr>
        <tr>
            <td>제목</td>
            <td>${oneBoard.title}</td>
        </tr>
        <tr>
            <td>날짜</td>
            <td>${oneBoard.regDate}</td>
        </tr>
        <tr>
            <td colspan="2">내용</td>
        </tr>
        <tr>
            <td colspan="2"><textarea rows="10" cols="50" disabled>${oneBoard.content}</textarea></td>
        </tr>
    </table>

    <button type="button" onclick="location.href='/'">메인</button>
    <button type="button" onclick="location.href='/board'">게시판</button>
</center>
</body>
</html>