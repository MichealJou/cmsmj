<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<div id="top">
        <div class="wrap">
            <ul class="topNav">
                <li><a href="javascript:AddFavorite('<%=basePath %>', '凯旋思拓信息技术有限公司')">收藏本站</a></li>
                <li><a href="javascript:;">留言反馈</a></li>
            </ul>
        </div>
    </div>
    <div id="header">
        <div class="wrap clearfix">
            <ul class="logo">
                <a href="<%=basePath %>">
                    <img src="<%=basePath %>resources/reception/kingstuo/img/logo_1.png" alt="凯旋思拓信息技术有限公司" title="凯旋思拓信息技术有限公司">
                </a>
            </ul>
            <ul class="searchBox">
                <form name="search" id="search" method="get" action="#">
                    <label for="keyword">输入您要搜索的产品名称</label>
                    <input name="s" type="text" class="keyword" title="输入您要搜索的产品名称" autocomplete="off" maxlength="128" value="产品搜索" onclick="formClick(this,&#39;产品搜索&#39;)">
                    <input type="submit" class="btnSearch" value="提交">
                </form>
            </ul>
        </div>
    </div>
    <div id="mainNav">
       ${menu }    
    </div>