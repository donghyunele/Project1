<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!-- Main content -->
<section>
    <div>
        <!-- left column -->
        <div>
            <!-- general form elements -->
            <div>
                <div>
                    <h3>REGISTER BOARD</h3>
                </div>
                <!-- /.box-header -->
                <form action="/board/register" method="post">
                    <div>
                        <label >Writer</label>
                        <input type="text" name="writer" placeholder="Enter Writer">
                    </div>
                    <div class="box-body">
                        <div class="form-group">
                            <label >Title</label>
                            <input type="text" name='title' placeholder="Enter Title">
                        </div>
                        <div>
                            <label >Content</label>
                            <textarea name="content" rows="3" placeholder="Enter ..."></textarea>
                        </div>

                    </div>
                    <div>
                        <button type="submit">글 작성 완료</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</div>
