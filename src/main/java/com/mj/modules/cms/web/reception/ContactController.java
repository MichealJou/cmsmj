package com.mj.modules.cms.web.reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.ContactService;

/**
 * 
 * @author zhouping
 *
 */
@Controller
public class ContactController extends BaseController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="contact.html",method=RequestMethod.GET)
	public String contact(Model model, Integer parentId, Integer ids){
		model.addAttribute("contactEntity", this.contactService.getContactEntity());
		model.addAttribute("leftMenu", this.menuService.getLeftMenuNavigation(parentId));
		model.addAttribute("topMenu", this.menuService.getTopMenuNavigation(ids, parentId));
		
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/contact";
		
	}

}
