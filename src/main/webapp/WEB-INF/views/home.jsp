<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<link href="./etc/css/home.css" rel="stylesheet">
<body>
<h1>
	Hello world!  Spring
</h1>

<img alt="" src="./resources/images/ana.png">


<P>  The time on the server is ${serverTime}. </P>

<a href="./notice/noticeList?name=notice">Go Notice</a>
<a href="./qna/qnaList">QnA</a>
<h3>Master</h3>
</body>
</html>
