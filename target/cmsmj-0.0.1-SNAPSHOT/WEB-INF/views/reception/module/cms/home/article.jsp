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
			<div class="treeBox">
				<h3>文章中心</h3>
				<ul>

					<li class="cur"><a href="javascript:;">公司动态</a></li>
					<li><a href="javascript:;">行业新闻</a></li>


				</ul>
			</div>
		</div>
		<div id="pageIn">
			<div class="urHere">
				当前位置：<a href="<%=basePath%>">首页</a><b>&gt;</b>文章中心
			</div>
			<div id="articleList">
				<c:forEach var="articleEntity" items="${articleEntityList }">
					<dl>
						<div class="numDate">
							<!-- <em>814</em>
							<p>10-23</p> -->
						</div>
						<dt>
							<a href="<%=basePath %>article.html?id=${articleEntity.artId}">${articleEntity.artTitle }</a>
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
						href="<%=basePath %>article_list.html?artType=${artType}&cur=${cur}&pageNo=1">第一页</a>
					<a
						href="<%=basePath %>article_list.html?artType=${artType}&cur=${cur}&pageNo=${pageNo-1}">上一页</a>
				</c:if>
				<c:if test="${pageNo ==totalPage}">
				     下一页
				     最末页
				   </c:if>
				<c:if test="${pageNo>1 && pageNo < totalPage }">

					<a
						href="<%=basePath %>article_list.html?artType=${artType}&cur=${cur}&pageNo=${pageNo+1}">下一页</a>
					<a
						href="<%=basePath %>article_list.html?artType=${artType}&cur=${cur}&pageNo=${totalPage}">最末页</a>
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