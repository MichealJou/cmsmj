<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
	<c:if test="${not empty pictureShowEntityList}">
	 <div class="mj_slider">
        <div id="banner_tabs" class="flexslider">
            <ul class="slides">
               <c:forEach var="pictureShowEntity" items="${pictureShowEntityList }" varStatus="index">
                <li>
                    <a title="" target="_blank" href="#">
                        <img width="1920" height="482" alt="" style="background: url('${pictureShowEntity.pictureUrlPath }') no-repeat center;" src="${pictureShowEntity.pictureUrlPath }">
                    </a>
                </li>
               </c:forEach>
            </ul>
            <ul class="flex-direction-nav">
                <li><a class="flex-prev" href="javascript:;">Previous</a></li>
                <li><a class="flex-next" href="javascript:;">Next</a></li>
            </ul>
            <ol id="bannerCtrl" class="flex-control-nav flex-control-paging">
            <c:forEach var="pictureShowEntity" items="${pictureShowEntityList }" varStatus="index">
             <li><a href="javascript:;">${index.index+1 }</a></li>
            </c:forEach>
            </ol>
        </div>
    </div>
    
    </c:if>