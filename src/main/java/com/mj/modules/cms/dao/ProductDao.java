package com.mj.modules.cms.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.ProductEntity;

/**
 * 获取产品
 * 
 * @author zhouping
 *
 */
@Repository("productDao")
public class ProductDao extends BaseDao<ProductEntity> {

	/**
	 * 推荐产品
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<ProductEntity> getProductEntityList(String comId) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from ProductEntity where comId = ?");
		return this.getSession().createQuery(hql.toString()).setParameter(0, comId).setFirstResult(0).setMaxResults(5)
				.list();

	}

	public ProductEntity getProductEntity(Integer id) {
		return this.get(id);
	}

	@SuppressWarnings("unchecked")
	public List<ProductEntity> getProductEntityList(String comId, Integer categoryId, Integer pageNo,
			Integer pageSize) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from ProductEntity where  ");
		hql.append("  comId = ?");
		if (categoryId != null) {
			hql.append(" and  productCategoryEntity.productCategoryId = ? ");
		}

		Query query = this.getSession().createQuery(hql.toString());
		if (categoryId != null) {
			query.setParameter(1, categoryId);
			
		} 
		query.setParameter(0, comId);
		return query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();

	}

	public int getProductEntityCount(String comId, Integer categoryId) {
		StringBuilder hql = new StringBuilder();
		hql.append(" select count(1) from ProductEntity ");
		hql.append(" where ");
		hql.append("  comId = ?");
		if (categoryId != null) {
			hql.append(" and  productCategoryEntity.productCategoryId = ? ");
		}

		Query query = this.getSession().createQuery(hql.toString());
		if (categoryId != null) {
			
			query.setParameter(1, categoryId);
		}
			query.setParameter(0, comId);
		
		return Integer.parseInt(String.valueOf(query.uniqueResult()));
	}

}
