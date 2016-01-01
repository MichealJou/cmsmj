<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<c:forEach var="menuEntity" items="${menu }" varStatus="status">
     <c:if test="${menuEntity.parentId eq '0' }">
	<li><a href="${menuEntity.link}" data-clickstatus="${status.index+1 }">${menuEntity.menuName }</a></li>
	</c:if>
	<%-- <li><a href="<%=basePath%>">业务分类</a></li>
	<li><a href="<%=basePath%>">关于我们</a></li>
	<li><a href="<%=basePath%>">新闻动态</a></li>
	<li><a href="<%=basePath%>">团队风采</a></li>
	<li><a href="<%=basePath%>">联系我们</a></li>
	<li><a href="<%=basePath%>">在线留言</a></li> --%>
</c:forEach>