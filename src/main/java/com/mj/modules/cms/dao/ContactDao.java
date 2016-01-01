package com.mj.modules.cms.dao;

import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.ContactEntity;

/**
 * 
 * @author zhouping
 *
 */
@Repository("contactDao")
public class ContactDao extends BaseDao<ContactEntity>{
	
	public ContactEntity  getContactEntity(String comId){
		return (ContactEntity) this.getSession().createQuery(" from ContactEntity where comId = ?").setParameter(0, comId).uniqueResult();
		
	}

}
