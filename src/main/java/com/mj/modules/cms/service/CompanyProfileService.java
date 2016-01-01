package com.mj.modules.cms.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.dao.CompanyProfileDao;
import com.mj.modules.cms.entity.CompanyProfileEntity;

@Service("companyProfileService")
@Transactional(readOnly = false)
public class CompanyProfileService extends BaseService {
	@Autowired
	private CompanyProfileDao companyProfileDao;

	public CompanyProfileEntity getCompanyProfileEntity() {
		try{
		if (StringUtils.isNotBlank(companyLimt)) {
			return companyProfileDao.getCompanyProfileEntity(companyLimt);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;

	}

}
