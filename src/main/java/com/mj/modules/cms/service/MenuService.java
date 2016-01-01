package com.mj.modules.cms.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.mj.common.service.BaseService;
import com.mj.modules.cms.constant.Constant;
import com.mj.modules.cms.dao.MenuDao;
import com.mj.modules.cms.entity.MenuEntity;

/**
 * 
 * @author Michael Jou
 *
 */
@Service
@Transactional(readOnly = true)
public class MenuService extends BaseService {

	protected static Logger logger = Logger.getLogger(MenuEntity.class);
	@Autowired
	private MenuDao meuDao;

	public List<MenuEntity> getMenuList(String type) {
		List<MenuEntity> list = null;
		if (StringUtils.isNotBlank(companyLimt)) {
			List<MenuEntity> menuEntityList = this.meuDao.getMenuEnityList(type, companyLimt);
			list = Lists.newArrayList();
			for (MenuEntity menuEntity : menuEntityList) {
				if (menuEntity.getParentId() == 0) {

					list.add(this.sort(menuEntity, menuEntityList));
				}
			}
		}

		return list;
	}

	/**
	 * 获取菜单
	 * 
	 * @param type
	 * @return
	 */
	public List<MenuEntity> getMenuNewList(String type) {
		List<MenuEntity> list = Lists.newLinkedList();
		if (StringUtils.isNotBlank(companyLimt)) {
			List<MenuEntity> menulist = this.meuDao.getMenuEnityList(type, companyLimt);
			for (MenuEntity menuEntity : menulist) {
				if (menuEntity.getParentId() == 0) {
					list.add(menuEntity);
				}
			}

		}
		return list;

	}

	public String generatingMenu(List<MenuEntity> menuEntityList) {
		StringBuilder tem = new StringBuilder();
		if (menuEntityList != null && !menuEntityList.isEmpty()) {
			int i = 0;
			tem.append(" <ul class='wrap'>");
			for (MenuEntity menuEntity : menuEntityList) {
				i = i + 1;
				tem.append("<li>");
				tem.append("<a class='active' data-clickstatus='");
				tem.append(i);
				tem.append("' href='");
				tem.append(menuEntity.getLink());
				if (StringUtils.isNotBlank(menuEntity.getLink())) {
					if (menuEntity.getLink().contains("?")) {
						tem.append("&parentId=");
						tem.append(menuEntity.getId());
						tem.append("&ids=");
						tem.append(menuEntity.getId());
					} else {
						tem.append("?parentId=");
						tem.append(menuEntity.getId());
						tem.append("&ids=");
						tem.append(menuEntity.getId());
					}
				}

				tem.append("'>");
				tem.append(menuEntity.getMenuName());
				tem.append("</a>");
				if (!menuEntity.getMenuEntityList().isEmpty()) {
					tem.append(this.grenTemplate(menuEntity.getMenuEntityList(), i, menuEntity.getId()));
				}

				tem.append("</li>");

			}
			tem.append("<div class='clear'></div></ul>");
		} else {
			logger.info("没有获取到菜单数据");
		}
		return tem.toString();

	}

	/**
	 * 获取Left菜单
	 * 
	 * @param parentId
	 * @return
	 */
	public List<MenuEntity> getLeftMenuNavigation(Integer parentId) {
		List<MenuEntity> menuEntityList =Lists.newArrayList();
		MenuEntity menuEntity = this.meuDao.getByIdMenuEntity(parentId);
		menuEntityList.add(menuEntity);
		if (menuEntity != null) {
			List<MenuEntity> menuEntityList1 = this.meuDao.getMenuEnityList(Constant.TOP, companyLimt);
			for (MenuEntity menuEntity1 : menuEntityList1) {
				if (menuEntity1.getParentId() == menuEntity.getId()) {
					menuEntityList.add(menuEntity1);
				}
			}
			

		}
		
		
		
		
		return menuEntityList;

	}

	public void sort(MenuEntity menuEntity) {
		List<MenuEntity> entityList = this.meuDao.getByIdMenuEntityList(menuEntity.getId());
		if (entityList != null && entityList.size() > 0) {
			menuEntity.getMenuEntityList().addAll(entityList);
			for (MenuEntity menuEntity2 : entityList) {
				this.sort(menuEntity2);
			}
		}
	}

	/**
	 * 
	 * @param menuEntity
	 */
	public void getSortMenu(MenuEntity menuEntity, List<MenuEntity> menuEntityList,
			List<MenuEntity> menuEntityListRoot, Integer lastIds) {
		for (MenuEntity menuEntity2 : menuEntityList) {
			if (menuEntity.getId() == menuEntity2.getParentId() && menuEntity2.getId()!=lastIds) {
				menuEntityListRoot.add(menuEntity2);
			} else {
				getSortMenu(menuEntity, menuEntityList, menuEntityListRoot,lastIds);
			}
		}
	}

	/**
	 * 获取 Top 菜单
	 * 
	 * @param parentId
	 * @return
	 */
	public List<MenuEntity> getTopMenuNavigation(Integer ids, Integer parentId) {

		MenuEntity menuEntityRoot = this.meuDao.getByIdMenuEntity(parentId);
		List<MenuEntity> menuEntityListRoot = Lists.newLinkedList();
		menuEntityListRoot.add(menuEntityRoot);
		List<MenuEntity> menuEntityList = this.meuDao.getMenuEnityList(Constant.TOP, companyLimt);
		MenuEntity menuEntitylast = this.meuDao.getByIdMenuEntity(ids);
		for (MenuEntity menuEntity : menuEntityList) {
			if (menuEntity.getId() == menuEntityRoot.getParentId() && menuEntity.getId()!=menuEntitylast.getId()) {
				menuEntityListRoot.add(menuEntity);
				getSortMenu(menuEntity, menuEntityList, menuEntityListRoot,menuEntitylast.getId());
			}
		}
		
		if(menuEntityRoot.getId() != menuEntitylast.getId()){
			menuEntityListRoot.add(menuEntitylast);
		}
	
		return menuEntityListRoot;

	}
}
