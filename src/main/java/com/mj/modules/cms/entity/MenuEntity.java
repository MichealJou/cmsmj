package com.mj.modules.cms.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.common.collect.Lists;

/**
 * 导航菜单
 * 
 * @author zhouping
 *
 */

@Entity
@Table(name = "t_menu")
public class MenuEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 489124390129681141L;

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 菜单名称
	 */
	private String menuName;

	/**
	 * 排列顺序
	 */
	private int sort;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 父类ID
	 */
	private Integer parentId;

	/**
	 * 链接地址
	 */
	private String link;

	/**
	 * 公司ID
	 */
	private String comId;

	private List<MenuEntity> menuEntityList = Lists.newArrayList();

	public MenuEntity() {
		super();

	}

	public MenuEntity(Integer id, String menuName, int sort, String type, Integer parentId, String comId) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.sort = sort;
		this.type = type;
		this.parentId = parentId;
		this.comId = comId;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 10)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "t_menu_name", length = 50, nullable = false)
	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "t_sort", length = 10, nullable = false)
	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Column(name = "t_type", length = 50, nullable = false)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "t_parent_id", nullable = false)
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Column(name = "com_id", length = 10, nullable = false)
	public String getComId() {
		return comId;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}

	public void setcomId(String comId) {
		this.comId = comId;
	}

	@Column(name = "t_link", length = 100)
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Transient
	public List<MenuEntity> getMenuEntityList() {
		return menuEntityList;
	}

	public void setMenuEntityList(List<MenuEntity> menuEntityList) {
		this.menuEntityList = menuEntityList;
	}

}
