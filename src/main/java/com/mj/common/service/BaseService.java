package com.mj.common.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mj.common.config.Global;
import com.mj.modules.cms.entity.MenuEntity;

public class BaseService {
	protected static String companyLimt = Global.getConfig("companylimt");

	protected static Integer pageSize = Integer.parseInt(Global.getConfig("pageSize"));
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected MenuEntity sort(MenuEntity menuEntity, List<MenuEntity> menuEntityList) {
		for (MenuEntity menuEntity2 : menuEntityList) {
			if (menuEntity.getId() == menuEntity2.getParentId()) {
				menuEntity.getMenuEntityList().add(menuEntity2);
				if (menuEntity2.getParentId() != 0) {
					this.sort(menuEntity2, menuEntityList);
				}
			}
		}

		return menuEntity;

	}

	protected String grenTemplate(List<MenuEntity> menuEntity, int i,int id) {

		StringBuilder tem = new StringBuilder();
		tem.append("<ul style='display:none;'>");
		int j = 1;
		for (MenuEntity menuEntity2 : menuEntity) {
			tem.append("<li><a data-clickstatus='");
			tem.append(i);
			tem.append("' data-menustatus='");
			tem.append(j++);
			tem.append("' href='");
			tem.append(menuEntity2.getLink());
			if (StringUtils.isNotBlank(menuEntity2.getLink())) {
				if (menuEntity2.getLink().contains("?")) {
					tem.append("&parentId=");
					tem.append(id);
					tem.append("&ids=");
					tem.append(menuEntity2.getId());
				} else {
					tem.append("?parentId=");
					tem.append(id);
					tem.append("&ids=");
					tem.append(menuEntity2.getId());
				}
			} 

			tem.append("'>");
			tem.append(menuEntity2.getMenuName());
			tem.append("</a>");
			if (!menuEntity2.getMenuEntityList().isEmpty()) {
				tem.append(grenTemplate(menuEntity2.getMenuEntityList(), i,id));
			}
			tem.append("</li>");
		}
		tem.append("</ul>");
		return tem.toString();

	}

}
