<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<!-- Main content -->
<section>
    <div>
        <!-- left column -->
        <div>
            <!-- general form elements -->
            <div>
                <div>
                    <h2>Modify BOARD</h2>
                </div>
                <!-- /.box-header -->
                <form:form action="/board/modify?boardNum=${modify.boardNum}" method="PUT">
                    <div>
                        <div>
                            <label >게시글 번호 : </label> <input type="text" name='boardNum' value="${modify.boardNum}" readonly="readonly">
                        </div>
                        <div>
                            <label>Writer</label> <input type="text" name="writer" value="${modify.writer}" readonly="readonly">
                        </div>
                        <div>
                            <h4>수정해주세요.</h4>
                        </div>
                        <div>
                            <label>Title</label> <input type="text" name='title' value="${modify.title}">
                        </div>
                        <div>
                            <label>Content</label>
                            <textarea name="content" rows="3">${modify.content}</textarea>
                        </div>

                    </div>
                    <!-- /.box-body -->
                    <div class="box-footer">
                        <button type="submit">수정하기</button>
                        <button type="button" onclick="location.href='/board/read?boardNum=${modify.boardNum}'">수정취소</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>
</body>
</html>