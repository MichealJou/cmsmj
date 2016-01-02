<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>产品介绍</title>
</head>
<body>

	<div class="wrap mb">
		<div id="pageLeft">
			<div class="treeBox">
				<jsp:include
					page="/WEB-INF/views/reception/module/cms/common/left_nav.jsp" />
			</div>
		</div>
		<div id="pageIn">

			<jsp:include
				page="/WEB-INF/views/reception/module/cms/common/top_nav.jsp" />

			<div id="product">
				<div class="productImg">
					<a href="${productEntity.productPictureUrlPath }" target="_blank"><img
						src="${productEntity.productPictureUrlPath }" width="300"></a>
				</div>
				<div class="productInfo">
					<h1>${productEntity.productName }</h1>

				</div>
				<div class="clear"></div>
				<div class="productContent">
					<h3>产品介绍</h3>
					<ul>
						<span style="color: #3C3A38;">${productEntity.productDesc }</span>
					</ul>
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