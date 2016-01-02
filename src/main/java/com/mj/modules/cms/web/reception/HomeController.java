package com.mj.modules.cms.web.reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.ArticleService;
import com.mj.modules.cms.service.CompanyProfileService;
import com.mj.modules.cms.service.ContactService;
import com.mj.modules.cms.service.ProductService;

/**
 * 
 * @author zhouping
 *
 */
@Controller
public class HomeController extends BaseController {
	@Autowired
	private CompanyProfileService companyProfileService;

	@Autowired
	private ProductService productService;

	@Autowired
	private ArticleService articleService;

	@Autowired
	private ContactService contactService;

	@RequestMapping(value = "index.html")
	public String index(Model model) {
		// // 获取公司信息

		model.addAttribute("companyProfileEntity", companyProfileService.getCompanyProfileEntity());
		// 获取产品信息
		model.addAttribute("productEntityList", productService.getProductEntityList());
		// 获取推荐
		model.addAttribute("articleEntityList", articleService.getArticleEntityList());
		// 获取联系人
		model.addAttribute("contactEntity", contactService.getContactEntity());
		// 获取推荐消息
		model.addAttribute("articleEntityNewsList", articleService.getArtcleEntityList());
		
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/index_new";

	}

}
