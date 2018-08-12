<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
<title>Test</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <% String path = request.getContextPath(); %>
    <script>
        function doF() {
            $.ajax({
                type : "post",
                url : "<%=path%>/sample/doF",
                success:function(result){
                    console.log(result);
                    $("#result").html("상품명 : "+result.productName + ", 가격 : "+result.productPrice);
                }
            });
        }
    </script>
</head>
<body>

    <button type="button" onclick="location.href='/signup'">회원가입</button>
    <button type="button" onclick="location.href='/event'">이벤트 참여하기</button>
    <button type="button" onclick="location.href='/board/listAll'">게시판</button>
    <button type="button" onclick="location.href='/item/list'">상품</button>
    <button type="button" onclick="location.href='/upload'">업로드</button>
    <button type="button" onclick="location.href='/summernote'">SummerNote Board 글쓰기</button>
<br>
<a href="javascript:doF()">doF</a> : json <br>

<div id="result"></div>
</body>
</html>