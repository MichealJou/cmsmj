package com.mj.modules.cms.web.reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.PictureShowService;

@Controller
public class CarouselController extends BaseController {

	@Autowired
	private PictureShowService pictureShowService;

	@RequestMapping(value = "carousel.html")
	public String carousel() {
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/carousel";

	}

	@RequestMapping(value = "carousel_new.html")
	public String carouselNew(Model model) {

		model.addAttribute("pictureShowEntityList", this.pictureShowService.getPictureShowEntityList());
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/carousel_new";
	}
}
