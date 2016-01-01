<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文章中心</title>

</head>
<body>

	<div class="wrap mb">
		<div id="pageLeft">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/left_nav.jsp"/>
		</div>
		<div id="pageIn">
			<jsp:include page="/WEB-INF/views/reception/module/cms/common/top_nav.jsp"/>
			<div id="articleList">
				<c:forEach var="articleEntity" items="${articleEntityList }">
					<dl>
						<div class="numDate">
							<!-- <em>814</em>
							<p>10-23</p> -->
						</div>
						<dt>
							<a href="<%=basePath %>article.html?id=${articleEntity.artId}&parentId=${parentId}&ids=${ids}">${articleEntity.artTitle }</a>
						</dt>
						<dd>
							<p class="desc">${articleEntity.artContent }</p>
						</dd>
					</dl>
				</c:forEach>
			</div>
			<div class="pager">

				总计 ${totalCount } 个记录，共 ${totalPage } 页，当前第 ${pageNo } 页 |


				<c:if test="${pageNo <= 1 }">
				    第一页
				  
				   </c:if>
				<c:if test="${pageNo > 1 &&  pageNo < totalPage }">
					<a
						href="<%=basePath %>article_list.html?artType=${artType}&parentId=${parentId}&ids=${ids}&pageNo=1">第一页</a>
					<a
						href="<%=basePath %>article_list.html?artType=${artType}&parentId=${parentId}&ids=${ids}&pageNo=${pageNo-1}">上一页</a>
				</c:if>
				<c:if test="${pageNo ==totalPage}">
				     下一页
				     最末页
				   </c:if>
				<c:if test="${pageNo>1 && pageNo < totalPage }">

					<a
						href="<%=basePath %>article_list.html?artType=${artType}&parentId=${parentId}&ids=${ids}&pageNo=${pageNo+1}">下一页</a>
					<a
						href="<%=basePath %>article_list.html?artType=${artType}&parentId=${parentId}&ids=${ids}&pageNo=${totalPage}">最末页</a>
				</c:if>


			</div>
		</div>
		<div class="clear"></div>
	</div>
	<script type="text/javascript">
		var cur = "${cur}";
	</script>
</body>
</html>