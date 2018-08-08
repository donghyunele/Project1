<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<body>
<div>
<jsp:include page="main.jsp"/>
    <br><br><br>
</div>
<div>
    <form action="/upload/files" method="post" enctype="multipart/form-data">
        <input type="file" name="files" multiple />
        <input type="submit" value="Upload Files">
    </form>
</div>
</body>
</html>