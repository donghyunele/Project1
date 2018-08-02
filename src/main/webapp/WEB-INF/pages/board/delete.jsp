<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>

<h2> Delete Form</h2>
<form:form action="/board/delete?boardNum=${delete.boardNum}" method="delete">

    여기에는 원래 비밀번호 확인 등의 확인 절차

    <button type="submit"> 제거 </button>
    <button type="button" onclick="location.href='/board/read?boardNum=${delete.boardNum}'">삭제취소</button>

</form:form>
</body>
</html>