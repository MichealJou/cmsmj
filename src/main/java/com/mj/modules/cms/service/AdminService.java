package com.mj.modules.cms.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;
import com.mj.common.service.BaseService;
import com.mj.common.util.Constant;
import com.mj.common.util.Encodes;
import com.mj.common.util.MessageConstant;
import com.mj.modules.cms.dao.AdminDao;
import com.mj.modules.cms.entity.AdminEntity;

@Service("adminService")
@Scope("prototype")
@Transactional(readOnly = true)
public class AdminService extends BaseService {

	@Autowired
	private AdminDao adminDao;

	public Map<String, Object> checkUser(String username, String password,HttpSession session) {

		Map<String, Object> message = Maps.newHashMap();
		if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
			AdminEntity adminEntity = this.adminDao.getAdmin(username.trim());

			if (adminEntity != null) {
				boolean isLogin = Encodes.isContrast(password.trim(), adminEntity.getPassword());
				if (isLogin) {
					session.setAttribute(Constant.ADMIN_USER, adminEntity);
					message.put("message", MessageConstant.MESSAGE_200);
				} else {
					message.put("message", MessageConstant.MESSAGE_101);
				}

			} else {
				message.put("message", MessageConstant.MESSAGE_101);
			}

		} else {
			message.put("message", MessageConstant.MESSAGE_101);
		}
		return message;

	}

}
