<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<div class="treeBox">
	<h3>${leftMenu[0].menuName }</h3>
	<ul>
		<c:if test="${not empty leftMenu}">
			<c:forEach var="menuEntity" items="${leftMenu}" varStatus="index">
			<c:choose>
			  <c:when test="${leftMenu.size() == 1 }">
			  <li class="cur"><a  data-menustatus="${index.index+1}"  data-leftmenustatus="${index.index+1}" href="${menuEntity.link}&parentId=${menuEntity.parentId}&ids=${menuEntity.id}">${menuEntity.menuName }</a></li>
			  </c:when>
			<c:otherwise>
			<c:choose>
			  <c:when test="${index.index == 1 }">
			  		   <li><a  data-menustatus="${1}"  data-leftmenustatus="${1}" href="${menuEntity.link}&parentId=${menuEntity.parentId}&ids=${menuEntity.id}">${menuEntity.menuName }</a></li>
			  </c:when>
			  <c:otherwise>
			  <c:if test="${index.index !=0 }">
			  <li><a  data-menustatus="${index.index}"  data-leftmenustatus="${index.index}" href="${menuEntity.link}&parentId=${menuEntity.parentId}&ids=${menuEntity.id}">${menuEntity.menuName }</a></li>
			 </c:if>
			  </c:otherwise>
			 </c:choose>
			</c:otherwise>
			</c:choose>
			</c:forEach>
		</c:if>
	</ul>
</div>