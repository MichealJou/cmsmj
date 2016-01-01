package com.mj.modules.cms.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 产品分类
 * 
 * @author zhouping
 *
 */
@Entity
@Table(name = "t_pro_category")
public class ProductCategoryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1898111453465724870L;

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_category_id", length = 10)
	private Integer productCategoryId;

	/**
	 * 分类名称
	 */
	@Column(name = "pro_category_name", nullable = false, columnDefinition = "text")
	private String productCategoryName;

	/**
	 * 分类简介
	 */
	@Column(name = "pro_category_desc", nullable = false, columnDefinition = "text")
	private String productCategoryDesc;

	/**
	 * 分类状态
	 */
	@Column(name = "pro_category_status", columnDefinition = "int default 0")
	private String productCategoryStatus;

	/**
	 * 父分类id
	 */
	@Column(name = "pro_category_parent_id", length = 10)
	private Integer productParentId;

	/**
	 * 
	 */
	@Column(name = "com_id", length = 10, nullable = false)
	private String comId;

	@OneToMany(targetEntity = ProductEntity.class, mappedBy = "productCategoryEntity" ,fetch=FetchType.LAZY)
	private List<ProductEntity> productEntitys = new ArrayList<ProductEntity>();

	public ProductCategoryEntity() {
		super();
	}

	public ProductCategoryEntity(Integer productCategoryId, String productCategoryName, String productCategoryDesc,
			String productCategoryStatus, Integer productParentId, String comId, List<ProductEntity> productEntitys) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.productCategoryDesc = productCategoryDesc;
		this.productCategoryStatus = productCategoryStatus;
		this.productParentId = productParentId;
		this.comId = comId;
		this.productEntitys = productEntitys;
	}

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public String getProductCategoryDesc() {
		return productCategoryDesc;
	}

	public void setProductCategoryDesc(String productCategoryDesc) {
		this.productCategoryDesc = productCategoryDesc;
	}

	public String getProductCategoryStatus() {
		return productCategoryStatus;
	}

	public void setProductCategoryStatus(String productCategoryStatus) {
		this.productCategoryStatus = productCategoryStatus;
	}

	public Integer getProductParentId() {
		return productParentId;
	}

	public void setProductParentId(Integer productParentId) {
		this.productParentId = productParentId;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public List<ProductEntity> getProductEntitys() {
		return productEntitys;
	}

	public void setProductEntitys(List<ProductEntity> productEntitys) {
		this.productEntitys = productEntitys;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
