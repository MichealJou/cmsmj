package com.mj.modules.cms.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.PictureShowEntity;

@Repository("pictureShowDao")
public class PictureShowDao extends BaseDao<PictureShowEntity> {

	@SuppressWarnings("unchecked")
	public List<PictureShowEntity> getPictureShowEntity(String company) {

		return this.getSession().createCriteria(PictureShowEntity.class).add(Restrictions.eq("comId", Integer.parseInt(company)))
				.addOrder(Order.asc("order")).list();

	}

}
