package com.mj.modules.cms.web.reception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mj.common.web.BaseController;

/**
 * 
 * @author zhouping
 *
 */
@Controller
public class ContentController extends BaseController{

	@RequestMapping(value="getContent.html")
	public String content(){
		return null;
		
	}
}
