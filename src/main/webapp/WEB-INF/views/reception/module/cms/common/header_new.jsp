<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<c:forEach var="menuEntity" items="${menu }" varStatus="status">

	<li><a href="${menuEntity.link}" data-clickstatus="${status.index+1 }">${menuEntity.menuName }</a></li>

</c:forEach>