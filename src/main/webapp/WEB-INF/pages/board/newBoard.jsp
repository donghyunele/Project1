<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<body>
<center>
    <form action="/newBoard" method="post">
        <table>
            <tr>
                <td colspan="2"><h2>게시판 글 작성</h2></td>
            </tr>

            <tr>
                <td>작성자</td>
                <td><input type="text" name="writer" size="30"></td>
            </tr>

            <tr>
                <td>제목</td>
                <td><input type="text" name="title" size="30"></td>
            </tr>

            <tr>
                <td>내용</td>
                <td><textarea cols="50" rows="15" name="content"></textarea></td>
            </tr>
        </table>
        <button type="submit">글 작성</button>
        <button type="button" onclick="location.href='/board'">게시판 목록으로 가기</button>
    </form>
</center>
</body>
</html>