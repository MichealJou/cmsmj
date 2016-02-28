<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include
	file="/WEB-INF/views/reception/module/cms/common/include_tag.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<meta name="baidu-site-verification" content="TEOqjr924J" />
<meta name="360-site-verification" content="af5a43fade1cc748de31f4eb84733d1b" />
<title>青岛凯旋思拓网络科技有限公司</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="keywords" content="凯旋,思拓,网络,青岛凯旋思拓网络科技有限公司,网站建设,电商运营,软件开发,软件销售,服务器销售">
<meta name="description" content="青岛凯旋思拓网络科技有限公司是由“凯旋工作室”2012年5月成立改名而来，是一家互联网科技企业，公司致力于提供专业互联网信息服务，从事网站建设、电商运营（天猫淘宝）、软件开发、软件销售、VI设计、服务器销售等项目为一体的解决方案服务商。公司主营业务软件开发设计，客户群囊括企业、学校、政府部门、商铺等。公司目前经营的开发项目有：管理系统、企业网站、综合门户网站、OA系统、进销存系统等。">
<meta name="renderer" content="webkit">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link rel="shortcut icon" type="image/x-icon"
	href="http://www.kingstuo.com/resources/reception/kingstuo/img/logo.png">
<link rel="stylesheet" type="text/css"
	href="http://www.kingstuo.com/resources/reception/kingstuo/css/neat-min.css">
<link rel="stylesheet" type="text/css"
	href="http://www.kingstuo.com/resources/reception/kingstuo/css/main.css">
<link rel="stylesheet" type="text/css"
	href="http://www.kingstuo.com/resources/reception/kingstuo/plugins/slick/slick.css">
<link rel="stylesheet" type="text/css"
	href="http://www.kingstuo.com/resources/reception/kingstuo/plugins/slider/css/slider.css">
<link rel="stylesheet" type="text/css"
	href="http://www.kingstuo.com/resources/reception/kingstuo/plugins/font-awesome-4.4.0/css/font-awesome.min.css">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if (gte IE 9)|!(IE)]><!-->
<script
	src="<%=basePath %>resources/reception/kingstuo/js/jquery/jquery.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
       <script src="<%=basePath %>resources/reception/kingstuo/js/ie/jquery.min.js"></script>
       <script src="<%=basePath %>resources/reception/kingstuo/js/modernizr.js"></script>
       <script src="<%=basePath %>resources/reception/kingstuo/js/html5.min.js"></script>
       <script src="<%=basePath %>resources/reception/kingstuo/js/respond.min.js"></script>
     <![endif]-->

</head>

<body>
	<header id="header" class="mj_header">
		<!-- 顶部开头 开始 -->
		<div class="mj_info_nav">
			<div class="mj_nav w-1000">
				<span class="hot_phone">全国服务热线 : 13188993993</span>
				<div class="mj_nav_rigth">
					<a href="javascript:;"
						onclick="AddFavorite('<%=basePath %>','凯旋思拓信息技术有限公司');">设为首页</a> ｜
					<a href="javascript:;">加入首页</a>
				</div>
			</div>
		</div>
		<!-- 顶部开头 结束 -->
		<!-- 导航菜单 开始部分 -->
		<div class="mj_menu_nav w-1000">
			<img src="<%=basePath %>resources/reception/kingstuo/img/logo_1.png"
				alt="凯旋思拓信息技术有限公司" class="logo">
			<ul class="mj_menu">
				<c:import url="/header_new.html" />

			</ul>
		</div>
		<!-- 导航菜单 结束部分 -->
	</header>
	<!-- 轮播图片 开始 -->
	<c:import url="/carousel_new.html" />
	<!-- 轮播图片 结束 -->
	<!-- 中间的内容区域 开始 -->
	<div class="mj_content w-1000">
		<!-- 产品定制 start -->
		<div class="mj_box box_left">
			<div class="mj_content_box">
				<img
					src="<%=basePath %>resources/reception/kingstuo/img/product_03.png"
					alt="">
				<h5>网站定制</h5>
			</div>
			<p>全方位满足网站的需求,适配主流终端系统,让您建站无忧</p>
		</div>
		<div class="mj_box">
			<div class="mj_content_box">
				<img
					src="<%=basePath %>resources/reception/kingstuo/img/product_03.png"
					alt="">
				<h5>网站定制</h5>
			</div>
			<p>全方位满足网站的需求,适配主流终端系统,让您建站无忧</p>
		</div>
		<div class="mj_box box_right">
			<div class="mj_content_box">
				<img
					src="<%=basePath %>resources/reception/kingstuo/img/product_03.png"
					alt="">
				<h5>网站定制</h5>
			</div>
			<p>全方位满足网站的需求,适配主流终端系统,让您建站无忧</p>
		</div>
		<!-- 产品定制 end -->
	</div>
	<!-- 关于我们 start -->
	<div class="mi_about_us_box">
		<img src="<%=basePath %>resources/reception/kingstuo/img/icon_03.png"
			height="75" width="74" class="mj_icon_wen">
		<div class="mj_line"></div>
		<div class="mj_about_us_box_1">
			<div class="box w-1000">
				<h4 class="mj_title">关于我们</h4>
				<div class="line_box clear-both">
					<span class="line"></span><span class="mj_st">STORE DISPLAY</span>
					<span class="line"></span>
				</div>
				<div class="mj_article">&nbsp;&nbsp;&nbsp;
					${companyProfileEntity.intrContent }</div>
				<div class="mj_box_banner ">
					<div class="slider center">
						<c:forEach var="productEntity" items="${productEntityList }"
							varStatus="index">
							<div>
								<a href="javascript:;" data-clickstatus="${status.index+1 }">
									<img src="${productEntity.productPictureUrlPath }" height="158"
									width="280">
								</a>
							</div>
						</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 关于我们 end -->
	<!-- 新闻资讯 start-->
	<%-- <div class="mj_box_information">
		<div class="mj_information_box w-1000">
			<div class="mj_line line_1"></div>
			<img
				src="<%=basePath %>resources/reception/kingstuo/img/icon_wen.png"
				height="75" width="75" class="mj_information_wen">
			<div class="mj_line line_2"></div>
			<div class="mj_information">
				<h4 class="mj_title">新闻资讯</h4>
				<div class="line_box clear-both">
					<span class="line"></span><span class="mj_st">STORE DISPLAY</span>
					<span class="line"></span>
				</div>
			</div>
		</div>
		<!-- 新闻资讯 box content start -->
		<div class="mj_information_content_box clear-both">
			<!-- 网站信息 start -->
			<div class="mj_information_box  clear-both w-1000">
				<div class="mj_information_tab">
					<!-- <span class="mj_tab active" id="information">最新资讯<i class="fa fa-caret-down mj_down mj_show"></i></span> -->
					<span class="mj_tab active" id="notice">网站公告 <i
						class="fa fa-caret-down mj_down mj_show"></i></span>
				</div>
				<!--  <ul class="mj_new_information mj_show" data-id="information">
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告1<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                </ul> -->
				<ul class="mj_new_information" data-id="notice">
					<c:forEach var="articleEntity" items="${articleEntityNewsList}">
						<li><i class="fa fa-angle-right"></i><a
							href="<%=basePath %>getArticleInfo.html?id=${articleEntity.artId}"
							target="_blank">${articleEntity.artTitle}<b
								class="mj_data_time"><fmt:formatDate
										value="${articleEntity.artCreateTime }" pattern="yyyy/mm/dd" /></b></a></li>
					</c:forEach>
					<!-- <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告2<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li>
                    <li><i class="fa fa-angle-right"></i><a href="#">凯旋思拓网络科技有限公司公告<b class="mj_data_time">2015/03/13</b></a></li> -->
				</ul>
				<!-- 轮播 图片 start -->
				<div class="mj_box_notice">
					<div class="slider center1">
						<div>
							<a href="javascript:;"> <img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
						<div>
							<a href="javascript:;"><img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
						<div>
							<a href="javascript:;"><img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
						<div>
							<a href="javascript:;"><img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
						<div>
							<a href="javascript:;"> <img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
						<div>
							<a href="javascript:;"> <img
								src="<%=basePath %>resources/reception/kingstuo/img/bar_single_01.png"
								height="302" width="303"></a>
						</div>
					</div>
				</div>
				<!-- 轮播 图片 end -->
			</div>
			<!-- 网站信息 end -->
		</div> --%>
		<!-- 新闻资讯 box content end -->
		<!--联系我们 start-->
		<%-- <div class="mj_contact clear-both">
			<div class="mj_contact_box w-1000">
				<div class="mj_line line_3"></div>
				<img
					src="<%=basePath %>resources/reception/kingstuo/img/icon_lian.png"
					height="74" width="74" class="mj_contact_lian">
				<div class="mj_contact_box_1 clear-both">
					<h4 class="mj_title">联系我们</h4>
					<div class="line_box clear-both">
						<span class="line"></span><span class="mj_st">STORE DISPLAY</span>
						<span class="line"></span>
					</div>
				</div>
			</div>
			<!-- 联系 内容部分 start-->
			<div class="mj_contact_box_content  w-1000 clear-both">
				<div class="mj_contact_left">
					<div class="mj_recode">
						<img
							src="<%=basePath %>resources/reception/kingstuo/img/recode.png"
							height="126" width="126" class="mj_recode_img"> <span>微信扫一扫<br>关注我们相关的信息
						</span>
					</div>
					<ul class="mj_contact_map">
						<li><i class="fa fa-phone fa-lg"></i><span class="mj_info">服务热线:&nbsp;${contactEntity.conTel}</span></li>
						<li><i class="fa fa-user fa-lg"></i><span class="mj_info">联&nbsp;系&nbsp;人:&nbsp;闫先生</span></li>
						<li><i class="fa fa-envelope  fa-lg"></i><span
							class="mj_info">公司邮箱:&nbsp;${contactEntity.conEmail }</span></li>
						<!-- <li><i class="fa fa-fax fa-lg"></i><span class="mj_info">公司传真:&nbsp;000-12345678</span></li> -->
						<li><i class="fa  fa-file-text-o fa-lg"></i><span
							class="mj_info">邮政编码:&nbsp;266200</span></li>
						<li><i class="fa fa-map-pin fa-lg"></i><span class="mj_info">公司地址:&nbsp;${contactEntity.conAddress}</span></li>
					</ul>
					<div class="map clear-both">
						<div id="container"></div>
					</div>
				</div>
				<div class="mj_contact_right">
					<form>
						<div class="mj_control">
							<label for="nickname">昵称</label> <input class="mj_contact_input"
								type="text" name="nickname" id="nickname">
						</div>
						<div class="mj_control">
							<label for="linetianhua">联系电话</label> <input
								class="mj_contact_input" type="text" name="linetianhua"
								id="linetianhua">
						</div>
						<div class="mj_control">
							<label for="dianziyouxiang">电子邮箱</label> <input
								class="mj_contact_input" type="text" name="dianziyouxiang"
								id="dianziyouxiang">
						</div>
						<div class="mj_control">
							<label for="neirong">内容</label> <input class="mj_contact_input"
								type="text" name="neirong" id="neirong">
						</div>
						<input class="mj_contact_info_sub" type="button" name=""
							value="提&nbsp;交">
					</form>
				</div>
			</div>
			<!-- 联系 内容部分 end-->
		</div> --%>
		<!--联系我们 end-->
		<footer>
			<div class="footer_1">
				<div class="mj_info_footer">
					关于我们: <a href="javascript:;"> <span class="fa fa-weibo"></span>
					</a> <a href="javascript:;"> <span class="fa fa-qq"></span>
					</a> <a href="javascript:;"> <span class="fa fa-wechat"></span>
					</a>
				</div>
				<ul class="mj_info_footer_ul">
					<li><a href="javascript:;">网站首页</a></li>
					<li><a href="javascript:;"><b class="mj_crcle"></b>新闻动态</a></li>
					<li><a href="javascript:;"><b class="mj_crcle"></b>关于我们</a></li>
					<li><a href="javascript:;"><b class="mj_crcle"></b>团队风采</a></li>
					<li><a href="javascript:;"><b class="mj_crcle"></b>联系我们</a></li>
					<li><a href="javascript:;"><b class="mj_crcle"></b>在线留言</a></li>
				</ul>
			</div>
			<div class="footer_2">©2015 凯旋思拓网络科技有限公司</div>
		</footer>
	</div>
	<!-- 中间的内容区域 结束 -->
	<script type="text/javascript"
		src="http://api.map.baidu.com/api?v=2.0&ak=Nshm7FdhOjQzXeytGu36v3OY"></script>
	<script type="text/javascript"
		src="http://www.kingstuo.com/resources/reception/kingstuo/plugins/slider/js/slider.js"></script>
	<script type="text/javascript"
		src="http://www.kingstuo.com/resources/reception/kingstuo/plugins/slick/slick.js"></script>
	<script type="text/javascript"
		src="http://www.kingstuo.com/resources/reception/kingstuo/js/main.js"></script>
	<script type="text/javascript"
		src="http://www.kingstuo.com/resources/reception/kingstuo/js/jquery.cookie/1.4.1/jquery.cookie.js"></script>
	<script type="text/javascript"
		src="http://www.kingstuo.com/resources/common/js/common.js"></script>
	<script type="text/javascript">
		$(function() {
			var bannerSlider = new Slider($('#banner_tabs'), {
				time : 5000,
				delay : 400,
				event : 'hover',
				auto : true,
				mode : 'fade',
				controller : $('#bannerCtrl'),
				activeControllerCls : 'active'
			});
			$('#banner_tabs .flex-prev').click(function() {
				bannerSlider.prev()
			});
			$('#banner_tabs .flex-next').click(function() {
				bannerSlider.next()
			});

			//轮播图片一

			$('.center').slick({
				centerMode : true,
				autoplay : true,
				arrows : true,
				centerPadding : '60px',
				slidesToShow : 3,
				cssEase : 'ease-in',
				responsive : [ {
					breakpoint : 200,
					settings : {
						arrows : false,
						centerMode : true,
						centerPadding : '40px',
						slidesToShow : 3
					}
				}, {
					breakpoint : 480,
					settings : {
						arrows : false,
						centerMode : true,
						centerPadding : '40px',
						slidesToShow : 1
					}
				} ]
			});
			//轮播图片二
			$('.center1').slick({
				centerMode : true,
				autoplay : true,
				arrows : true,
				centerPadding : '0px',
				slidesToShow : 1,
				cssEase : 'ease-in',
				responsive : [ {
					breakpoint : 200,
					settings : {
						arrows : false,
						centerMode : true,
						centerPadding : '40px',
						slidesToShow : 3
					}
				}, {
					breakpoint : 480,
					settings : {
						arrows : false,
						centerMode : true,
						centerPadding : '40px',
						slidesToShow : 1
					}
				} ]
			});
			var map = new BMap.Map("container"); // 创建地图实例  
			var point = new BMap.Point(120.436772,36.207765); // 创建点坐标  
			map.centerAndZoom(point, 15);
		});
	</script>
	<script>
		(function() {
			var bp = document.createElement('script');
			bp.src = '//push.zhanzhang.baidu.com/push.js';
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(bp, s);
		})();
	</script>

</body>

</html>
