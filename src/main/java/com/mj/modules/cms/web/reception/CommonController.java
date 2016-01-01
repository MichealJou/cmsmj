package com.mj.modules.cms.web.reception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.constant.Constant;
import com.mj.modules.cms.entity.MenuEntity;
import com.mj.modules.cms.service.MenuService;

/**
 * 共同controller
 * 
 * @author Michael Jou
 *
 */
@Controller
public class CommonController extends BaseController {

	@Autowired
	private MenuService menuService;

	/**
	 * 初始化导航栏
	 * 
	 * @return
	 */
	@RequestMapping(value = "/header.html")
	public String navigation(Model model) {

		List<MenuEntity> menuEntityList = this.menuService.getMenuList(Constant.TOP);
		model.addAttribute("menu", this.menuService.generatingMenu(menuEntityList));

		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/header";

	}
	/**
	 * 初始化导航栏
	 * 
	 * @return
	 */
	@RequestMapping(value = "/header_new.html")
	public String navigationNew(Model model) {

		List<MenuEntity> menuEntityList = this.menuService.getMenuNewList(Constant.TOP);
		model.addAttribute("menu",menuEntityList);

		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/header_new";

	}
	/**
	 * footer部分
	 * 
	 * @return
	 */
	@RequestMapping(value = "/footer.html")
	public String footer() {
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/common/footer";

	}
	

}
