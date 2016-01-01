package com.mj.modules.cms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_company")
public class CompanyEntity implements Serializable{

	
	private static final long serialVersionUID = -7630897367599761843L;

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="com_id",length=10,nullable=false)
	private Integer comId;
	
	/**
	 * 公司名称
	 */
	@Column(name="com_name",nullable=false,length=20)
	private String comName;
	
	/**
	 *  公司负责人
	 */
	@Column(name="com_charge",length=50)
	private String comCharge;
	
	/**
	 *  公司地址
	 */
	@Column(name="com_address",length=50)
	private String comAddress;

	public CompanyEntity() {
		super();
	}
	
	public CompanyEntity(Integer comId, String comName, String comCharge, String comAddress) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.comCharge = comCharge;
		this.comAddress = comAddress;
	}

	
	public Integer getComId() {
		return comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComCharge() {
		return comCharge;
	}

	public void setComCharge(String comCharge) {
		this.comCharge = comCharge;
	}

	public String getComAddress() {
		return comAddress;
	}

	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


  
	
	
}
