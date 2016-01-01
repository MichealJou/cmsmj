package com.mj.modules.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.dao.ContactDao;
import com.mj.modules.cms.entity.ContactEntity;

@Service("contactService")
@Transactional(readOnly=true)
public class ContactService extends BaseService {

	@Autowired
	private ContactDao contactDao;

	public ContactEntity getContactEntity() {
		return this.contactDao.getContactEntity(companyLimt);
	}
}
