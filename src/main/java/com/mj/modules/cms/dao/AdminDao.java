package com.mj.modules.cms.dao;

import org.hibernate.Session;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.RootEntityResultTransformer;
import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.AdminEntity;

/**
 * 管理用户
 * 
 * @author zhouping
 *
 */
@Repository("adminDao")
public class AdminDao extends BaseDao<AdminEntity> {

	/**
	 * 根据用户名获取用户
	 * @param username
	 * @return
	 */
	public AdminEntity getAdmin(String username) {
		
		Session session = this.getSession();
		StringBuilder sql = new StringBuilder();
		sql.append(" from ");
		sql.append(" AdminEntity where username = ? ");
		sql.append(" and isDel = 0 ");
		AdminEntity adminEntity = (AdminEntity) session.createQuery(sql.toString()).setParameter(0, username)
				.uniqueResult();
		
		return adminEntity;
	}

}
