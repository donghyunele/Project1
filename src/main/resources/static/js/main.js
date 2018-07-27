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

$(function() { $("#postcodify_search_button").postcodifyPopUp(); });

$(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = 'https://connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v3.1&appId=383422078729692&autoLogAppEvents=1';
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));


function kakao(){
// $("#kakao-link-btn").click(function () {
    //<![CDATA[
// // 사용할 앱의 JavaScript 키를 설정해 주세요.
    Kakao.init('2cb3a6e0fcbaa964db791d1f9ad50f0d');
// // 카카오링크 버튼을 생성합니다. 처음 한번만 호출하면 됩니다.
    Kakao.Link.createDefaultButton({
        container: '#kakao-link-btn',
        objectType: 'feed',
        content: {
            title: '딸기 치즈 케익',
            description: '#케익 #딸기 #삼평동 #카페 #분위기 #소개팅',
            imageUrl: 'http://k.kakaocdn.net/dn/Q2iNx/btqgeRgV54P/VLdBs9cvyn8BJXB3o7N8UK/kakaolink40_original.png',
            link: {
                mobileWebUrl: 'localhost:8080/',
                webUrl: 'localhost:8080/'
            }
        },
        social: {
            likeCount: 286,
            commentCount: 45,
            sharedCount: 845
        },
        buttons: [{
            title: '웹으로 보기',
            link: {
                mobileWebUrl: 'localhost:8080/',
                webUrl: 'localhost:8080/'
            }
        },
            {
                title: '앱으로 보기',
                link: {
                    mobileWebUrl: 'localhost:8080/',
                    webUrl: 'localhost:8080/'
                }
            }]
    });

}
// })
