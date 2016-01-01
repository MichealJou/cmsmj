package com.mj.modules.cms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mj.common.dao.BaseDao;
import com.mj.modules.cms.entity.MenuEntity;

/**
 * 菜单
 * 
 * @author zhouping
 *
 */
@Repository("menuDao")
public class MenuDao extends BaseDao<MenuEntity> {

	/**
	 * 获取菜单
	 * 
	 * @param type
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<MenuEntity> getMenuEnityList(String type, String company) {

		StringBuilder hql = new StringBuilder();
		hql.append(" from MenuEntity ");
		hql.append(" where type = ?");
		hql.append(" and comId = ? ");
		hql.append(" order by type , sort asc");

		return this.getSession().createQuery(hql.toString()).setParameter(0, type).setParameter(1, company).list();

	}

	/**
	 * 根据ID查询数据
	 * 
	 * @param parentId
	 * @return
	 */
	public MenuEntity getByIdMenuEntity(Integer id) {

		return this.get(id);

	}
	
	/**
	 * 根据ID 查菜单
	 * @param parentId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<MenuEntity> getByIdMenuEntityList(Integer parentId){
		StringBuilder hql = new StringBuilder();
		hql.append(" from MenuEntity");
		hql.append(" where parentId =?");
		hql.append(" order by type , sort asc ");
		return this.getSession().createQuery(hql.toString()).setParameter(0, parentId).list();
	}
}
