package com.mj.modules.cms.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.mj.common.service.BaseService;
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
	 * @param type
	 * @return
	 */
	public List<MenuEntity>  getMenuNewList(String type){
		List<MenuEntity> list = null;
		if (StringUtils.isNotBlank(companyLimt)) {
			list = this.meuDao.getMenuEnityList(type, companyLimt);
			
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
				tem.append("<a data-clickstatus='");
				tem.append(i);
				tem.append("' href='");
				tem.append(menuEntity.getLink());
				if (StringUtils.isNotBlank(menuEntity.getLink())) {
					if (menuEntity.getLink().contains("?")) {
						tem.append("&cur=");
						tem.append(i);
					} else {
						tem.append("?cur=");
						tem.append(i);
					}
				} else {
					tem.append("?cur=");
					tem.append(i);
				}

				tem.append("'>");
				tem.append(menuEntity.getMenuName());
				tem.append("</a>");
				if (!menuEntity.getMenuEntityList().isEmpty()) {
					tem.append(this.grenTemplate(menuEntity.getMenuEntityList(), i));
				}

				tem.append("</li>");

			}
			tem.append("<div class='clear'></div></ul>");
		} else {
			logger.info("没有获取到菜单数据");
		}
		return tem.toString();

	}

}
