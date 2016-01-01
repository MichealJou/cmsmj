package com.mj.modules.cms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_cantact")
public class ContactEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8030589050509218971L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="con_id",length=10,nullable=false)
	private Integer conId;
    
    /**
     *  通讯地址
     */
    @Column(name="con_address",length=100,nullable=false)
	private String conAddress;
	
    /**
     * 邮编
     */
    @Column(name="con_code",length=20,nullable=false)
	private String conCode;
	
    /**
     *邮箱地址 
     */
    @Column(name="con_email",length=20,nullable=false)
	private String conEmail;
	
    /**
     * 咨询电话
     */
    @Column(name="con_tel",length=11,nullable=false)
	private String conTel;
	
    /**
     *  公司网址
     */
    @Column(name="con_page",length=50,nullable=false)
	private String conPage;
	
    
    /**
     *  咨询电话对应人
     */
    @Column(name="con_tel_man",length=11)
	private String conTelMan;
	
    /**
     *  公司id
     */
    @Column(name="com_id",length=10,nullable=false)
	private String comId;
	
    public ContactEntity() {
		super();
	}

	public ContactEntity(Integer conId, String conAddress, String conCode, String conEmail, String conTel,
			String conPage, String conTelMan, String comId) {
		super();
		this.conId = conId;
		this.conAddress = conAddress;
		this.conCode = conCode;
		this.conEmail = conEmail;
		this.conTel = conTel;
		this.conPage = conPage;
		this.conTelMan = conTelMan;
		this.comId = comId;
	}

	public Integer getConId() {
		return conId;
	}

	public void setConId(Integer conId) {
		this.conId = conId;
	}

	public String getConAddress() {
		return conAddress;
	}

	public void setConAddress(String conAddress) {
		this.conAddress = conAddress;
	}

	public String getConCode() {
		return conCode;
	}

	public void setConCode(String conCode) {
		this.conCode = conCode;
	}

	public String getConEmail() {
		return conEmail;
	}

	public void setConEmail(String conEmail) {
		this.conEmail = conEmail;
	}

	public String getConTel() {
		return conTel;
	}

	public void setConTel(String conTel) {
		this.conTel = conTel;
	}

	public String getConPage() {
		return conPage;
	}

	public void setConPage(String conPage) {
		this.conPage = conPage;
	}

	public String getConTelMan() {
		return conTelMan;
	}

	public void setConTelMan(String conTelMan) {
		this.conTelMan = conTelMan;
	}

	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
