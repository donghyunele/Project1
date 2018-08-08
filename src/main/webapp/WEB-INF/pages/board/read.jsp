<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <% String path = request.getContextPath(); %>
    <script>
        $(document).ready(function () {
            listReply2();

            $("#btnReply").click(function () {
                var replytext=$("#replytext").val();
                var bno = "${read.boardNum}";
                var param = {
                    "replyContent" : replytext,
                    "boardNum" : bno
                };

                console.log(param);

                $.ajax({
                    <%--url: "<%=path%>/reply/insert",--%>
                    type: "POST",
                    contentType: "application/json; charset=UTF-8",
                    dataType: "json",
                    data: JSON.stringify(param),
                    success: function () {
                        alert("댓글이 등록되었습니다");
                        listReply2();
                    }
                });
            });
        });

        function listReply2() {
            $.ajax({
                type:"get",
                url : "localhost:8080/reply/listJson?boardNum=${read.boardNum}",
                success: function (result) {
                    console.log(result);
                    var output = "<table>";
                    for (var i in result){
                        output += "<tr>";
                        output += "(" + result[i].regDate + ")<br>";
                        output += result[i].replyContent+"</td>";
                        output += "</tr>";
                    }
                    output += "</table>";
                    $("#listReply").html(output);
                }
            });
        }
    </script>
</head>
<body>

<jsp:include page="../main.jsp" />
<!-- Main content -->
<section class="content">
    <div class="row">
        <!-- left column -->
        <div class="col-md-12">
            <!-- general form elements -->
            <div class="box box-primary">
                <div class="box-header">
                    <h3 class="box-title">READ BOARD</h3>
                </div>
                <div class="box-body">
                    <div class="form-group">
                        <label>Title</label> <input type="text" name='title' class="form-control" value="${read.title}" readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label>Content</label>
                        <textarea class="form-control" name="content" rows="3" readonly="readonly">${read.content}</textarea>
                    </div>
                    <div class="form-group">
                        <label>Writer</label> <input type="text" name="writer" class="form-control" value="${read.writer}" readonly="readonly">
                    </div>
                    <div class="form-group">
                        <label>조회수 : </label> <input type="text" name="count" class="form-control" value="${read.count}" readonly="readonly">
                    </div>
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    <button type="button" onclick="location.href='/board/listAll'">목록</button>
                    <button type="button" onclick="location.href='/board/modify?boardNum=${read.boardNum}'" >Modify</button>
                    <button type="button" onclick="location.href='/board/delete?boardNum=${read.boardNum}'">REMOVE</button>

                </div>


                <form action="reply/insert" method="post">
                <div style="width:650px; text-align: center;">
                    <br>
                    <textarea rows="5" cols="80" id="replytext" placeholder="댓글을 작성해주세요."></textarea>
                    <br>
                    <button type="submit" id="btnReply">댓글 작성</button>
                </div>
                </form>

                <div id="listReply"></div>
            </div>
        </div>
    </div>
</section>
</body>
</html>