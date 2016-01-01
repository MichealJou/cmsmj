package com.mj.modules.cms.dao;

import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.CompanyProfileEntity;

@Repository("companyProfileDao")
public class CompanyProfileDao extends BaseDao<CompanyProfileEntity> {
	
	public CompanyProfileEntity getCompanyProfileEntity(String companyLimit){
		
		return (CompanyProfileEntity) this.getSession().createQuery(" from CompanyProfileEntity where comId = ?").setParameter(0, companyLimit).uniqueResult();
		
	}

}
