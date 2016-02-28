package com.mj.modules.cms.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/index.html")
	public String index(Model model){
		  model.addAttribute("user", "你好");
		return "/WEB-INF/view/index";
	}
	
}
