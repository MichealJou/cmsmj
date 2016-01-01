package com.mj.modules.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.ProductCategoryEntity;

@Repository("productCategoryDao")
public class ProductCategoryDao extends BaseDao<ProductCategoryEntity> {

	@SuppressWarnings("unchecked")
	public List<ProductCategoryEntity> getProductCategoryList(String comId) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from  ProductCategoryEntity ");
		hql.append(" where comId = ?");
		return this.getSession().createQuery(hql.toString()).setParameter(0, comId).list();

	}

}
