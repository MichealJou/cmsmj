package com.mj.modules.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.dao.ProductCategoryDao;
import com.mj.modules.cms.entity.ProductCategoryEntity;

@Service("productCategoryService")
@Transactional(readOnly = true)
public class ProductCategoryService extends BaseService {

	@Autowired
	private ProductCategoryDao productCategoryDao;

	public List<ProductCategoryEntity> getProductCategoryList() {
		return this.productCategoryDao.getProductCategoryList(companyLimt);
	}
}
