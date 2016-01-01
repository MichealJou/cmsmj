<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
  <c:import url="/carousel.html"/>
    <div id="index" class="wrap mb">
    <div id="indexLeft">
        <div class="incBox">
            <h3><a href="http://fit-find.com/product_category.php">产品展示</a></h3>
            <ul class="recommendProduct">
            <c:forEach var="productEntity" items="${productEntityList}">
            <li>
                    <p class="img"><a href="<%=basePath %>product.html?id=${productEntity.productId}">
                        <img src="${productEntity.productPictureUrlPath}" width="135" height="135"></a></p>
                    <p class="name"><a href="<%=basePath %>product.html?id=${productEntity.productId}">${productEntity.productName }</a></p>
                </li>
            </c:forEach>
                <div class="clear"></div>
            </ul>
        </div>
        <div class="incBox">
            <h3>公司简介</h3>
            <div class="about">
                <p><img src="<%=basePath %>resources/reception/cms/img/img_company.jpg"></p>
                <dl>
                    <dt>MJ</dt>
                    <dd>青岛非凡信息技术有限公司位于青岛市崂山区软件园,是一家主营业务包括企业信息化解决方案、软件及互联网产品研发销售、医疗器械等领域的高科技公司。公司通过了双软认证和ISO9001质量体系认证。...</dd>
                </dl>
                <div class="clear"></div>
                <a href="<%=basePath %>company.html?cur=2" class="aboutBtn">查看详细公司简介</a>
            </div>
        </div>  </div>
    <div id="indexRight">
       <c:if test="${not empty articleEntityList }">
        <div class="incBox">
            <h3><a href="<%=basePath%>article_list.html">新闻中心</a></h3>
            <ul class="recommendArticle">
           
               <c:forEach var="articleEntity" items="${articleEntityList}">
               <li><b><fmt:formatDate value="${articleEntity.artCreateTime }" pattern="MM-dd"></fmt:formatDate></b><a href="<%=basePath%>article_list.html?id=${articleEntity.artId}&artType=2&amp;cur=4">${articleEntity.artTitle }</a></li>
               </c:forEach>
                
            </ul>
        </div>
        </c:if>
        <div class="contact">
            <h3>联系我们</h3>
            <div class="box">
                <dl><dt class="address"></dt><dd>公司地址：${contactEntity.conAddress}</dd></dl>
                <dl><dt class="tel"></dt><dd>销售热线：${contactEntity.conTel}</dd></dl>
                <!-- <dl><dt class="fax"></dt><dd>传真号码：0532-85758120</dd></dl> -->
                <dl><dt class="url"></dt><dd>公司网址：${contactEntity.conPage }</dd></dl>
                <dl><dt class="email"></dt><dd>电子邮箱：${contactEntity.conEmail }</dd></dl>
            </div>
        </div>
    </div>
    <div class="clear"></div>
    <script type="text/javascript">
      var cur = "${cur}";
    </script>
   
</div>
</body>
</html>
