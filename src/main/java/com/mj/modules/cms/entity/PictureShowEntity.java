package com.mj.modules.cms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 首页的图片
 * @author zhouping
 *
 */
@Entity
@Table(name="t_show")
public class PictureShowEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8900231313359704942L;
	
	/**
	 * 主键ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="show_id",length=10)
	private Integer id;

	/**
	 * 图片的名称
	 */
	@Column(name="t_show_pic_name",nullable=false,length=20,unique=true)
	private String prictureName;
	
	/**
	 * 图片的路径
	 */
	@Column(name=" show_pic_path",nullable=false,length=100)
	private String pricturePath;
	
	/**
	 * 图片可对外访问的路径
	 */
	@Column(name="show_pic_url_path",length=100,nullable=false)
	private String pictureUrlPath;
	
	/**
	 * 图片的排列顺序
	 */
	@Column(name="show_pic_order",unique=true,nullable=false,length=10)
	private Integer order;
	
	/**
	 * 图片配文
	 */
	@Column(name=" show_pic_text",length=50,nullable=true)
	private String pictureText;
	
	/**
	 *  公司ID
	 */
	@Column(name="com_id",length=10,nullable=false)
	private Integer comId;
	
	/**
	 * 0为展示1为不展示
	 */
	@Column(name=" show_del",length=1,columnDefinition="int default 0")
	private Integer isShowDel;

	public PictureShowEntity() {
		super();
		
	}

	public PictureShowEntity(Integer id, String prictureName, String pricturePath, String pictureUrlPath, Integer order,
			String pictureText, Integer comId, Integer isShowDel) {
		super();
		this.id = id;
		this.prictureName = prictureName;
		this.pricturePath = pricturePath;
		this.pictureUrlPath = pictureUrlPath;
		this.order = order;
		this.pictureText = pictureText;
		this.comId = comId;
		this.isShowDel = isShowDel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrictureName() {
		return prictureName;
	}

	public void setPrictureName(String prictureName) {
		this.prictureName = prictureName;
	}

	public String getPricturePath() {
		return pricturePath;
	}

	public void setPricturePath(String pricturePath) {
		this.pricturePath = pricturePath;
	}

	public String getPictureUrlPath() {
		return pictureUrlPath;
	}

	public void setPictureUrlPath(String pictureUrlPath) {
		this.pictureUrlPath = pictureUrlPath;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getPictureText() {
		return pictureText;
	}

	public void setPictureText(String pictureText) {
		this.pictureText = pictureText;
	}

	public Integer getComId() {
		return comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public Integer getIsShowDel() {
		return isShowDel;
	}

	public void setIsShowDel(Integer isShowDel) {
		this.isShowDel = isShowDel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
