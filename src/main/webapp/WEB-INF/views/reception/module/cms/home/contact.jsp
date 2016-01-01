<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系我们</title>
</head>
<body>

	<div class="wrap mb">
		<div id="pageLeft">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/left_nav.jsp"/>
		</div>
		<div id="pageIn">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/top_nav.jsp"/>
			<div id="page">
				<h1>联系我们</h1>
				<div class="content">
					<strong>通讯地址：</strong><br> <span style="color: #d7d7d7;">----------------------------------------------------------------------------------------------------------------------------</span><br>
					<p>通讯地址：${contactEntity.conAddress }</p>
					<p>邮编：${contactEntity.conCode }</p>
					<p>
						<br> <strong>客服邮箱：</strong><br> <span
							style="color: #d7d7d7;">----------------------------------------------------------------------------------------------------------------------------</span><br>
						<span>服务邮箱：${contactEntity.conEmail }</span><br> <span>欢迎您的来信，我们将在一个工作日内给予回复。</span><br>
						<br> <strong>客服电话：</strong><br> <span
							style="color: #d7d7d7;">----------------------------------------------------------------------------------------------------------------------------</span><br>
						<span>咨询电话为 ${contactEntity.conTel }。</span><br> <span>工作时间为周一至周五
							9:00-18:00，节假日休息。</span><br> <span>我们将随时为您献上真诚的服务。</span><br>
						<br> <strong>网站网址：</strong><br> <span
							style="color: #d7d7d7;">----------------------------------------------------------------------------------------------------------------------------</span><br>
						<span><a href="${contactEntity.conPage }">${contactEntity.conPage }</a></span>
					</p>
					<p>
						<br>
						<!-- <iframe style="width: 560px; height: 362px;" src="/map.htm"
							frameborder="0"> </iframe> -->
					</p>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<script type="text/javascript">
		var cur = "${cur}";
	</script>
</body>
</html>