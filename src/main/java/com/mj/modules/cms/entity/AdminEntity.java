package com.mj.modules.cms.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 系统用户
 * 
 * @author zhouping
 *
 */
@Entity
@Table(name = "t_sys_admin")
public class AdminEntity implements Serializable {

	private static final long serialVersionUID = 6881682110182298214L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 10)
	private Integer id;

	/**
	 * 用户名
	 */
	@Column(name = "username", length = 20, nullable = false,unique=true)
	private String username;

	/**
	 * 密码
	 */
	@Column(name = "password", length = 50, nullable = false)
	private String password;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDateTime")
	private Date createDateTime;

	/**
	 * 更新时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDateTime")
	private Date updateDateTime;

	/**
	 * 是否删除
	 */
	@Column(name = "isDel", length = 1, columnDefinition = "int default 0")
	private Integer isDel;

	public AdminEntity() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}
