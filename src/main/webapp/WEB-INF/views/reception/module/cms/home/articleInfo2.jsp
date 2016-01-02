<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp" />
 <link rel="shortcut icon" type="image/x-icon" href="<%=basePath %>resources/reception/kingstuo/img/logo.png"> 
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>resources/reception/kingstuo/css/neat-min.css">

<link rel="stylesheet" type="text/css"
	href="<%=basePath%>resources/reception/kingstuo/css/artcleinfo.css">
<!--[if (gte IE 9)|!(IE)]><!-->
<script
	src="<%=basePath%>resources/reception/kingstuo/js/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
       <script src="<%=basePath%>resources/reception/kingstuo/js/ie/jquery.min.js"></script>
       <script src="<%=basePath%>resources/reception/kingstuo/js/modernizr.js"></script>
       <script src="<%=basePath%>resources/reception/kingstuo/js/html5.min.js"></script>
       <script src="<%=basePath%>resources/reception/kingstuo/js/respond.min.js"></script>
     <![endif]-->
</head>
<body>

	<div class="contaier">
		<div class="header_title_1">
			<h4>${articleEntityInfo.artTitle}</h4>
			<span class="title_date"> <fmt:formatDate
					value="${articleEntityInfo.artCreateTime }"
					pattern="yyyy-mm-dd hh:mm"></fmt:formatDate></span>
		</div>
		<div class="mj_content_page">${articleEntityInfo.artContent }</div>
	</div>
</body>