<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章展示</title>

</head>
<body>

	<div class="wrap mb">
		<div id="pageLeft">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/left_nav.jsp"/>
		</div>
		<div id="pageIn">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/top_nav.jsp"/>
			<div id="article">
				${articleEntity.artContent }
			</div>

		</div>
		<div class="clear"></div>
	</div>
	<script type="text/javascript">
		var cur = "${cur}";
	</script>
</body>
</html>