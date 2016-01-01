package com.mj.modules.cms.web.reception;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.CompanyProfileService;

/**
 * 公司简介
 * 
 * @author zhouping
 *
 */
@Controller
public class CompanyProfileController extends BaseController {
	
	@Autowired
	private CompanyProfileService companyProfileService;

	@RequestMapping(value = "/company.html", method = RequestMethod.GET)
	public String company(Model model) {
		model.addAttribute("data",companyProfileService.getCompanyProfileEntity());
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/company";
	}
}
