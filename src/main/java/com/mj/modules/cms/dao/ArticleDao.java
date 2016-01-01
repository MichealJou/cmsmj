package com.mj.modules.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.ArticleEntity;

@Repository("articleDao")
public class ArticleDao extends BaseDao<ArticleEntity> {

	@SuppressWarnings("unchecked")
	public List<ArticleEntity> getArticleEntityList(String comId) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from ArticleEntity where comId = ? ");
		hql.append(" order by 	artCreateTime desc ");
		return this.getSession().createQuery(hql.toString()).setParameter(0, comId).setFirstResult(0).setMaxResults(5)
				.list();

	}

	/**
	 * 根据ID获取信息
	 * 
	 * @param id
	 * @return
	 */
	public ArticleEntity getArticleEntityId(Integer id) {

		return this.get(id);
	}

	@SuppressWarnings("unchecked")
	public List<ArticleEntity> getArticleEntity(String type, String companyLimt) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from ArticleEntity where artType = ? ");
		hql.append(" and comId = ? ");
		hql.append(" and artStatus = 0 order by artCreateTime desc");
		return this.getSession().createQuery(hql.toString()).setParameter(0, type).setParameter(1, companyLimt).list();

	}

	@SuppressWarnings("unchecked")
	public List<ArticleEntity> getArticleEntityList(String type, String companyLimt, Integer pageNo, Integer pageSize) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from ArticleEntity where artType = ? ");
		hql.append(" and comId = ? ");
		hql.append(" and artStatus = 0 order by artCreateTime desc");
		return this.getSession().createQuery(hql.toString()).setParameter(0, type).setParameter(1, companyLimt)
				.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();

	}

	public Integer getArticleEntityCount(String type, String companyLimt) {
		StringBuilder hql = new StringBuilder();
		hql.append("select count(1) from ArticleEntity where artType = ? ");
		hql.append(" and comId = ? ");
		hql.append(" and artStatus = 0 order by artCreateTime desc");
		return Integer.parseInt(String.valueOf(this.getSession().createQuery(hql.toString()).setParameter(0, type)
				.setParameter(1, companyLimt).uniqueResult()));
	}
}
