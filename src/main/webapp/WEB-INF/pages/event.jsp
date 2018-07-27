<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width">


    <title>Event Link Test</title>
    <%-- 카카오 링크 관련 --%>
    <script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

    <%-- 페이스북 링크 관련 마크업--%>
    <meta property="fb:app_id" content="APP_ID" />
    <meta property="og:type" content="website" />
    <meta property="og:title" content="웹 페이지 제목" />
    <meta property="og:url" content="웹 페이지 URL" />
    <meta property="og:description" content="웹 페이지 내용" />
    <meta property="og:image" content="웹 페이지 대표 이미지" />
</head>
<body>
<button type="button" onclick="location.href='/'">메인으로가기</button>
<br />
        <a id="kakao-link-btn" href="javascript:;">
            <img src="//dev.kakao.com/assets/img/about/logos/kakaolink/kakaolink_btn_medium.png">
        </a>
        <div class="fb-share-button" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-size="small" data-mobile-iframe="true"><a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fplugins%2F&amp;src=sdkpreparse" class="fb-xfbml-parse-ignore">공유하기</a></div>

<div id="fb-root"></div>
<script>(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = 'https://connect.facebook.net/ko_KR/sdk.js#xfbml=1&version=v3.1&appId=383422078729692&autoLogAppEvents=1';
    fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>



<script type="text/javascript">
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
    //]]>
</script>

</body>
</html>