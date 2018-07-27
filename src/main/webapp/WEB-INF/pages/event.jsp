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

<button id="kakao-link-btn" onclick="kakao()">
    <img src="//dev.kakao.com/assets/img/about/logos/kakaolink/kakaolink_btn_medium.png">
</button>

<div class="fb-share-button" data-href="https://developers.facebook.com/docs/plugins/" data-layout="button_count" data-size="small" data-mobile-iframe="true">
    <a target="_blank" href="https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fdevelopers.facebook.com%2Fdocs%2Fplugins%2F&amp;src=sdkpreparse" class="fb-xfbml-parse-ignore">공유하기</a>
</div>

<script src="/js/main.js" type="text/javascript"></script>
</body>
</html>