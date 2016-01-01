package com.mj.common.web;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.mj.common.config.Global;
import com.mj.common.util.DateUtils;
import com.mj.modules.cms.entity.MenuEntity;
import com.mj.modules.cms.service.MenuService;
/**
 * 基础的controller
 * @author zhouping
 *
 */
public abstract class BaseController {
	
	protected static Integer pageSize = Integer.parseInt(Global.getConfig("pageSize"));
	@Autowired
	public HttpSession session;
	@Autowired
    public MenuService menuService;
	
	@Autowired
	public HttpServletRequest httpServletRequest;
	/**
	 * 初始化数据绑定
	 * 1. 将所有传递进来的String进行HTML编码，防止XSS攻击
	 * 2. 将字段中Date类型转换为String类型
	 */
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
		binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(text == null ? null : StringEscapeUtils.escapeHtml4(text.trim()));
			}
			@Override
			public String getAsText() {
				Object value = getValue();
				return value != null ? value.toString() : "";
			}
		});
		// Date 类型转换
		binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) {
				setValue(DateUtils.parseDate(text));
			}
		});
		
	}
	
	
	
}
