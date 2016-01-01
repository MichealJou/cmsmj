package com.mj.modules.cms.web.reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mj.common.constant.ViewPrefixConstant;
import com.mj.common.web.BaseController;
import com.mj.modules.cms.service.ArticleService;

@Controller
public class ArticleController extends BaseController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "recruitment.html", method = RequestMethod.GET)
	public String recruitment(Model model) {

		model.addAttribute("articleEntity", articleService.getArticleEntity());

		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/recruitment";

	}

	@RequestMapping(value = "article_list.html", method = RequestMethod.GET)
	public String getArticleList(Model model, String artType,Integer pageNo) {
		if(pageNo == null){
			pageNo = 1;
		}
		model.addAttribute("artType", artType);
		model.addAttribute("articleEntityList", this.articleService.getArticleEntityList(artType, pageNo));
		int totalCount = this.articleService.getArticleEntityCount(artType);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("totalPage", totalCount%pageSize == 0 ? totalCount/pageSize : totalCount/pageSize+1);
	
		model.addAttribute("pageNo", pageNo);
		
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/article";
	}

	@RequestMapping(value="article.html",method = RequestMethod.GET)
	public String getArticleEntity(Model model, Integer id,String artType) {
		
		model.addAttribute("articleEntity", articleService.getArticleEntity(id));
		model.addAttribute("artType", artType);
		return ViewPrefixConstant.CMS_VIEW_PREFIX + "cms/home/articleinfo";
	}

}
