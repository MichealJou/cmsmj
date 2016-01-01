<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>招聘信息</title>

</head>
<body>

	<div class="wrap mb">
		<div id="pageLeft">
			<div class="treeBox">
				<h3>招聘信息</h3>
				<ul>
				   <li class="cur"><a href="javascript:;">招聘信息</a></li>
					
				</ul>
			</div>
		</div>
		<div id="pageIn">
			<div class="urHere">
				当前位置：<a href="<%=basePath%>">首页</a><b>&gt;</b>招聘信息
			</div>
			<div id="page">
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