package com.mj.modules.cms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.util.CacheUtils;
import com.mj.modules.cms.service.AdminService;

@Controller
public class HomeController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/index.html")
	public String index(Model model){
	    String userInfo = 	(String) CacheUtils.get("userInfo");
	    adminService.getAdminEntityList();
	    if (userInfo != null) {
			System.err.println(userInfo);
		}else{
			CacheUtils.put("userInfo", "hello world");
		}
		  model.addAttribute("user", "你好");
		return "/WEB-INF/view/index";
	}
	
}
