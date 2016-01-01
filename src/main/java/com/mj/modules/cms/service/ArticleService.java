package com.mj.modules.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.constant.Constant;
import com.mj.modules.cms.dao.ArticleDao;
import com.mj.modules.cms.entity.ArticleEntity;

@Service("articleService")
@Transactional(readOnly = true)
public class ArticleService extends BaseService {

	@Autowired
	private ArticleDao articleDao;

	/**
	 * 获取推荐信息
	 * 
	 * @return
	 */
	public List<ArticleEntity> getArticleEntityList() {
		return articleDao.getArticleEntityList(companyLimt);
	}

	public ArticleEntity getArticleEntity(Integer id) {
		if (id == null) {
			return this.articleDao.getArticleEntityId(id);
		}
		return null;
	}

	public ArticleEntity getArticleEntity() {

		List<ArticleEntity> articleEntityList = this.articleDao.getArticleEntity(Constant.ARTTYPE_RECRUITMENT,companyLimt);
		if (articleEntityList != null && !articleEntityList.isEmpty()) {
			return articleEntityList.get(0);
		}
		return null;

	}

	public List<ArticleEntity> getArticleEntityList(String artType,Integer pageNo) {
		return this.articleDao.getArticleEntityList(artType,companyLimt,pageNo,pageSize);

	}
	
	public Integer getArticleEntityCount(String artType){
		return this.articleDao.getArticleEntityCount(artType, companyLimt);
		
	}
}
