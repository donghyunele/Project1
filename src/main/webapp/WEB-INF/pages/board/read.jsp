<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<body>
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
                <!-- /.box-header -->
                <form role="form" method="post">
                    <input type='hidden' name='boardNum' value="${read.boardNum}">
                </form>
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
                    <button type="button" onclick="location.href='/modify'" >Modify</button>
                    <button type="submit" class="btn-danger">REMOVE</button>
                    <button type="submit" class="btn-primary">LIST ALL</button>
                </div>

            </div>
        </div>
    </div>
</section>
<script>

    $(document).ready(function() {

        var formObj = $("form[role='form']");

        console.log(formObj);

        $(".btn-warning").on("click", function () {
            formObj.attr("action", "/board/modify");
            formObj.attr("method", "get");
            formObj.submit();
        });

        $(".btn-danger").on("click", function () {
            formObj.attr("action", "/board/remove");
            formObj.submit();
        });

        $(".btn-primary").on("click", function () {
            self.location = "/board/listAll";
        });

    })

</script>
</body>
