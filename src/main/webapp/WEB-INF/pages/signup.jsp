<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>

<body>

<form action="signup" method="POST">
    <center>
    <table>
        <tr align="center">
            <td>아이디 : </td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr align="center">
            <td>비밀번호 : </td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr align="center">
            <td>비밀번호확인 : </td>
            <td><input type="password" onkeyup="chk()"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><span></span></td>
        </tr>
        <tr align="center">
            <td>이름 : </td>
            <td><input type="text" name="name"></td>
        </tr>

        <tr align="center">
            <td width="100">우편번호 : </td>

            <td><input type="text" size="6" name="zipcode" class="postcodify_postcode5" value="" />
                <button type="button" id="postcodify_search_button">검색</button>
            </td>
        </tr>
        <tr align="center">
            <td width="100">도로명 주소 : </td>
            <td><input type="text" name="mainaddr" class="postcodify_address" value="" /></td>
        </tr>

        <tr align="center">
            <td width="100">상세주소 : </td>
            <td><input type="text" name="subaddr" class="postcodify_details" value="" /></td>
        </tr>
        <tr align="center">
            <td width="100">참고항목 : </td>
            <td><input type="text" name="refaddr" class="postcodify_extra_info" value="" /></td>
        </tr>
        <!-- "검색" 단추를 누르면 팝업 레이어가 열리도록 설정한다 -->

   </table>

        <button type="submit">회원가입</button>
        <button type="button" onclick="location.href='/'">메인화면</button>
    </center>
</form>
<!-- jQuery와 Postcodify를 로딩한다 -->
<script src="//ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script src="//d1p7wdleee1q2z.cloudfront.net/post/search.min.js"></script>

<script> $(function() { $("#postcodify_search_button").postcodifyPopUp(); }); </script>

</body>

<script>
    var txt = document.getElementsByTagName("input");
    var msg = document.querySelector("span");

    function chk(){
        // 두 인풋박스의 일치 여부 확인
        // 일치 여부에 따른 문구 출력
        if(txt[1].value == txt[2].value){
            msg.innerHTML="일치합니다.";
            msg.style.color ="blue";
        }else{
            msg.innerHTML="일치하지 않습니다.";
            msg.style.color ="red";
        }
    }
</script>


</html>