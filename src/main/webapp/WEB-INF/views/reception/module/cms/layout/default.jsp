<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property='title' /></title>
<%@include file="/WEB-INF/views/reception/module/cms/common/include.jsp"%>
</head>
<body>
	<div id="wrapper">
		<c:import url="/header.html" />
           <sitemesh:write property='body' />
		<c:import url="/footer.html" />
	</div>
	
	<script>
	  $(function(){
		  $("a[data-cur='"+cur+"']").parent().addClass("cur");
		  
		  
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