<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<body>
<jsp:include page="../main.jsp" />
<!-- Main content -->
<section class="content">
    <div class="row">
        <!-- left column -->
        <div class="col-md-12">
            <!-- general form elements -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">LIST ALL PAGE</h3>
                </div>
                <div class="box-body">
                    <button type="button" onclick="location.href='/board/register'">글쓰기</button>
                    <table class="table table-bordered">
                        <tr>
                            <th>BNO</th>
                            <th>WRITER</th>
                            <th>TITLE</th>
                            <th>조회수</th>
                            <th>REGDATE</th>

                        </tr>
                         <c:forEach items="${list}" var="boardVO">
                            <tr>
                                <td>${boardVO.boardNum}</td>
                                <td>${boardVO.writer}</td>
                                <td><a href='/board/read?boardNum=${boardVO.boardNum}'>${boardVO.title}</a></td>
                                <td align="center">${boardVO.count}</td>
                                <td><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVO.regDate}" /></td>
                                <td><button type="button" onclick="location.href='/board/delete?boardNum=${boardVO.boardNum}'">삭제</button></td>
                           </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
</div>
<!-- /.content-wrapper -->

</body>
</html>