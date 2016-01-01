package com.mj.modules.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.dao.ProductDao;
import com.mj.modules.cms.entity.ProductEntity;

@Service("productService")
@Transactional(readOnly = true)
public class ProductService extends BaseService {

	@Autowired
	private ProductDao productDao;

	public List<ProductEntity> getProductEntityList() {
		return productDao.getProductEntityList(companyLimt);

	}

	public List<ProductEntity> getProductEntityList(Integer pageNo, Integer productCategoryId) {
		if (pageNo == null) {
			pageNo = 1;
		}

		return this.productDao.getProductEntityList(companyLimt, productCategoryId, pageNo, pageSize);
	}

	public ProductEntity getProductEntity(Integer id) {
		return this.productDao.getProductEntity(id);
	}
	
	public Integer getProductEntityCount(Integer productCategoryId){
		return this.productDao.getProductEntityCount(companyLimt, productCategoryId);
		
	}
}
