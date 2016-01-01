package com.mj.modules.cms.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author zhouping
 *
 */
@Entity
@Table(name="t_product")
public class ProductEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4126231012585950545L;
	
	/**
	 * 产品ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pro_id",length=10)
	private Integer productId;
	
	/**
	 * 产品名称
	 */
	@Column(name="pro_name",length=30,nullable=false)
	private String productName;
	
	/**
	 *产品简介
	 */
	@Column(name="pro_desc",columnDefinition="text",nullable=false)
	private String productDesc;
	
	/**
	 * 产品图片名称
	 */
	@Column(name="pro_pic_name",length=50,nullable=false)
	private String productPictureName;
	
	/**
	 * 产品图片路径
	 */
	@Column(name="pro_pic_path",nullable=false,length=100)
	private String productPicturePath;
	
	/**
	 * 产品图片对外访问路径
	 */
	@Column(name="pro_pic_url_path",nullable=false,length=100)
	private String productPictureUrlPath;
	
	/**
	 * 
	 */
	@Column(name="com_id",length=10,nullable=false)
	private String comId;
	
	@ManyToOne(targetEntity=ProductCategoryEntity.class,cascade=CascadeType.ALL )
	@JoinColumn(name="product_group_Id",referencedColumnName="pro_category_id")
	private ProductCategoryEntity productCategoryEntity;

	public ProductEntity() {
		super();
	}

	public ProductEntity(Integer productId, String productName, String productDesc, String productPictureName,
			String productPicturePath, String productPictureUrlPath, String comId,
			ProductCategoryEntity productCategoryEntity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPictureName = productPictureName;
		this.productPicturePath = productPicturePath;
		this.productPictureUrlPath = productPictureUrlPath;
		
		this.comId = comId;
		this.productCategoryEntity = productCategoryEntity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductPictureName() {
		return productPictureName;
	}

	public void setProductPictureName(String productPictureName) {
		this.productPictureName = productPictureName;
	}

	public String getProductPicturePath() {
		return productPicturePath;
	}

	public void setProductPicturePath(String productPicturePath) {
		this.productPicturePath = productPicturePath;
	}

	public String getProductPictureUrlPath() {
		return productPictureUrlPath;
	}

	public void setProductPictureUrlPath(String productPictureUrlPath) {
		this.productPictureUrlPath = productPictureUrlPath;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public ProductCategoryEntity getProductCategoryEntity() {
		return productCategoryEntity;
	}

	public void setProductCategoryEntity(ProductCategoryEntity productCategoryEntity) {
		this.productCategoryEntity = productCategoryEntity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
