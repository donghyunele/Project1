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

        <%-- todo 주소 찾기 (api 적용) --%>
   </table>

        <button type="submit">회원가입</button>
        <button type="button" onclick="location.href='/'">메인화면</button>
    </center>
</form>
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