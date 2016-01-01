package com.mj.modules.cms.web.reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.ProductCategoryService;
import com.mj.modules.cms.service.ProductService;

/**
 * 
 * @author zhouping
 * @version 1.0.0
 */
@Controller
public class ProductController extends BaseController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductCategoryService productCategoryService;

	@RequestMapping(value = "product.html", method = RequestMethod.GET)
	public String getProductList(Integer id, Model model, Integer pageNo, Integer parentId, Integer ids) {

		model.addAttribute("productCategoryList", this.productCategoryService.getProductCategoryList());
		model.addAttribute("productEntityList", this.productService.getProductEntityList(pageNo, id));
		model.addAttribute("leftMenu", this.menuService.getLeftMenuNavigation(parentId));
		model.addAttribute("topMenu", this.menuService.getTopMenuNavigation(ids, parentId));
		int totalCount = this.productService.getProductEntityCount(id);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("parentId",parentId);
		model.addAttribute("ids", ids);
		model.addAttribute("totalPage", totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1);
		if (pageNo == null) {
			pageNo = 1;
		}
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("id", id);
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/product";
	}

	@RequestMapping(value = "productInfo.html", method = RequestMethod.GET)
	public String getProductInfo(Model model, Integer id, Integer parentId,Integer ids) {
		if(parentId != null && ids != null){
			model.addAttribute("leftMenu", this.menuService.getLeftMenuNavigation(parentId));
			model.addAttribute("topMenu", this.menuService.getTopMenuNavigation(ids,parentId));
		}
		
		model.addAttribute("productEntity", this.productService.getProductEntity(id));
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/productInfo";
	}
}
