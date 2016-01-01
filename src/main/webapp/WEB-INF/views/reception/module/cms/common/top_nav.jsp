<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<div class="urHere">
	当前位置：<a href="<%=basePath%>">首页</a>
	<c:forEach var="topMenu" items="${topMenu }">
		<b>&gt;</b>${topMenu.menuName }
   </c:forEach>

</div>