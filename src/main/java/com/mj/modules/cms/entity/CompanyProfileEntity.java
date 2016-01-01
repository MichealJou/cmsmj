package com.mj.modules.cms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 公司简介
 * @author zhouping
 *
 */
@Entity
@Table(name="t_introduction")
public class CompanyProfileEntity implements Serializable{

	private static final long serialVersionUID = -1329771630849572725L;

	/**
	 * 主键ID
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="intr_id",length=10)
	private Integer intrId;  
	
	/**
	 * 简介内容
	 */
	@Column(name="intr_content",unique=true,length=50,nullable=false)
	private String  intrContent;
  	
	/**
	 *  公司理念
	 */
	@Column(name="intr_idea",length=50)
	private String idea;
	
	/**
	 *  公司宗旨
	 */
	@Column(name="intr_purpose",length=50)
	private String purpose;
	
	/**
	 * 公司目标
	 */
	@Column(name="instr_terget",length = 50)
	private String target;
	
	@Column(name=" intr_slogan",length=50)
	private String slogan;
	
	@Column(name="com_id",length=10,nullable=false)
	private String  comId;

	public Integer getIntrId() {
		return intrId;
	}

	public void setIntrId(Integer intrId) {
		this.intrId = intrId;
	}

	public String getIntrContent() {
		return intrContent;
	}

	public void setIntrContent(String intrContent) {
		this.intrContent = intrContent;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}
	
	
}
