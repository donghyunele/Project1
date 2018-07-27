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
