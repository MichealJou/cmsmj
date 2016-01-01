package com.mj.modules.cms.web.reception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;

@Controller
public class CarouselController extends BaseController {

	@RequestMapping(value = "carousel.html")
	public String carousel() {
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/carousel";

	}
}
