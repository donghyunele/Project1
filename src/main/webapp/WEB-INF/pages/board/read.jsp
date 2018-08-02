<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
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
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    <button type="button" onclick="location.href='/board/listAll'">목록</button>
                    <button type="button" onclick="location.href='/board/modify?boardNum=${read.boardNum}'" >Modify</button>
                    <button type="button" onclick="location.href='/board/delete?boardNum=${read.boardNum}'">REMOVE</button>

                </div>

            </div>
        </div>
    </div>
</section>
</body>
</html>