$(function(){	
	var commentIndex = 0;
	var commentValue = 3;
	var bH1C = new Array();
	var bH3C = new Array();
	var bBH = new Array();
	var banner;
	var sloganBgColor = new Array();
	var bannerImg = new Array();
	var bannerBgImg = new Array();
	var bannerLeftImg = new Array();
	var bannerRightImg = new Array();
	
	$(".bannerInner div").each(function(){
		bH1C.push($(this).attr("h1content"));
		bH3C.push($(this).attr("h3content"));
		bBH.push($(this).attr("buttonLink"));
		bannerImg.push($(this).attr("imgsrc"));
		bannerBgImg.push($(this).attr("bgimg"));
		bannerLeftImg.push($(this).attr("leftimg"));
		bannerRightImg.push($(this).attr("rightimg"));
		sloganBgColor.push($(this).attr("sloganbgcolor"));
		$(".bannerControl").append('<li></li>')
	});

	var bannerNowIndex = 0;
	var bannerNumber = $(".bannerInner div").length - 1;
	var bannerAutoPlayHolder;
	function chageTime(){
			var gTid = Math.floor(Math.random()*1000+600);
			return gTid;
		}
	function chageState(){var gid=Math.floor(Math.random()*29);switch(gid){case 0:x='easeInQuad';break;case 1:x='easeOutQuad';break;case 2:x='easeInOutQuad';break;case 3:x='easeInCubic';break;case 4:x='easeOutCubic';break;case 5:x='easeInOutCubic';break;case 6:x='easeInQuart';break;case 7:x='easeOutQuart';break;case 8:x='easeInOutQuart';break;case 9:x='easeInQuint';break;case 10:x='easeOutQuint';break;case 11:x='easeInOutQuint';break;case 12:x='easeInSine';break;case 13:x='easeOutSine';break;case 14:x='easeInOutSine';break;case 15:x='easeInExpo';break;case 16:x='easeOutExpo';break;case 17:x='easeInOutExpo';break;case 18:x='easeInCirc';break;case 19:x='easeOutCirc';break;case 20:x='easeInOutCirc';break;case 21:x='easeInElastic';break;case 22:x='easeOutElastic';break;case 23:x='easeInOutElastic';break;case 24:x='easeInBack';break;case 25:x='easeOutBack';break;case 26:x='easeInOutBack';break;case 27:x='easeInBounce';break;case 28:x='easeOutBounce';break;case 29:x='easeInOutBounce';break;}return x;};
	function bannerAutoPlay(){
			bannerNowIndex++;
			if(bannerNowIndex > bannerNumber){bannerNowIndex = 0;}
			changWallPaper();
		}
	function changWallPaper(btnIndex){
			$(".bannerImage  , .bannerSlogan").remove().empty().detach();
			
			if(btnIndex != null){bannerNowIndex = btnIndex;}
	
			//设置背景图片
			$(".bannerInner").css("background","url(" + bannerBgImg[bannerNowIndex] + ") no-repeat");
			//设置左侧渐变图片
			$(".bannerLeftDiv").css("background","url(" + bannerLeftImg[bannerNowIndex] + ") repeat-x");
			//设置右侧渐变图片
			$(".bannerRightDiv").css("background","url(" + bannerRightImg[bannerNowIndex] + ") repeat-x");
			
			createBanner(bannerNowIndex);
			$(".bannerImage").animate({top:"0px",opacity:1},chageTime(),chageState());
			$(".bannerSlogan").animate({top:"150px",right:"50",opacity:1},chageTime(),chageState(),function(){changeTip();});
			$(".bannerControl li").css({background:"black"});
			$(".bannerControl li").eq(bannerNowIndex).css({background:"#FF009D"});
		}
		function createBanner(i){
			banner = "<img src='"+bannerImg[i]+"' class='bannerImage bannerI'  />" +
					"<div class='bannerSlogan bannerS'" + " style='background:" + sloganBgColor[i] +  "'>" +
						"<div class='bAS C'>" +
							"<div class='bannerIcon'>" +
								//"<img src='"+bannerIcon[0]+"' />" + 
								"</div>" +
								"<div class='bannerTitle'>"+bH1C[i]+"</div>" + 
								"<div class='bannerDesc'>"+bH3C[i]+"</div>" + 
								"<div class='bannerButton'>" +
									"<a href='"+bBH[i]+"'>ReadMore</a>" +
								"</div></div></div>";
								
			$(".bannerInner").append(banner);
			$(".bannerImage").css("position","absolute");
		}
	
	if(typeof document.body.style.maxHeight === "undefined") {
			window.browserIE6 = true;
	}
	
	if(window.browserIE6){
		$(".bannerInner , .bannerLeftBar , .bannerControl , .bannerRightBar").css({display:"none"});
		$(".Banner").css({background:"url(images/IEBANNER.jpg) no-repeat center"});
	}else{
		changWallPaper();
		bannerAutoPlayHolder = setInterval(bannerAutoPlay,6000);	
		function changeTip(){
			$(".bannerIcon").animate({left:0},500,chageState());
			$(".bannerTitle").animate({top:"20px"},500,chageState());
			$(".bannerDesc").animate({left:"5px"},500,chageState());
			$(".bannerButton").animate({right:"85px"},500,chageState());
		}

		$(".bannerControl li").click(function(){
			clearInterval(bannerAutoPlayHolder);
			var blI = $(this).index(); 
			changWallPaper(blI);
			bannerAutoPlayHolder = setInterval(bannerAutoPlay,6000);
		})
		
		$(".bannerLeftBar").click(function(){
			clearInterval(bannerAutoPlayHolder);
			bannerNowIndex--;
			if(bannerNowIndex < 0 ){bannerNowIndex = bannerNumber;}
			changWallPaper();
			bannerAutoPlayHolder = setInterval(bannerAutoPlay,6000);
		})
		
		$(".bannerRightBar").click(function(){
			clearInterval(bannerAutoPlayHolder);
			bannerNowIndex++;
			if(bannerNowIndex > bannerNumber ){bannerNowIndex = 0;}
			changWallPaper();
			bannerAutoPlayHolder = setInterval(bannerAutoPlay,6000);
		});
		
		 $(".bannerLeftBar , .bannerRightBar").css({opacity:0});
			$(".Banner").hover(function(){
			   $(".bannerLeftBar , .bannerRightBar").animate({opacity:1},200).dequeue();
		 },function(){
			   $(".bannerLeftBar , .bannerRightBar").animate({opacity:0},200).dequeue();
		 })
	}	
})