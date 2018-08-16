<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("#UserUpdate").click(function () {
                if (confirm("수정하시겠습니까?")) {
                    document.form1.action = "http://localhost:8080/users/modify";
                    document.form1.method="PUT";
                    document.form1.submit();
                }
            });
        })
    </script>
</head>
<body>
<jsp:include page="../main.jsp" />

<h2> '${user.id}' 님의 회원 정보 수정 </h2>

<form method="post" name="form1">
    <table>
        <tr>
            <td>ID</td>
            <td><input name="id" value="${user.id}" readonly="readonly"></td>
        </tr>
        <tr>
            <td>PASSWORD</td>
            <td><input type="password" name="password"> </td>
        </tr>
        <tr>
            <td>이름</td>
            <td><input name="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>회원가입일자</td>
            <td>
                <fmt:formatDate value="${user.regDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="button" value="수정완료" id="UserUpdate">
                <input type="button" value="유저목록" id="UserList">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
