package com.mj.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mj.common.util.Constant;
import com.mj.modules.cms.entity.AdminEntity;


/**
 * 验证用户登陆
 * @author zhouping
 *
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{


	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		     HttpSession session =  request.getSession();
		    if(request.isRequestedSessionIdValid()){
		    	AdminEntity adminEntity =  (AdminEntity) session.getAttribute(Constant.ADMIN_USER);
		    	if(adminEntity != null){
		    		return true;
		    	}else{
		    		response.sendRedirect("admin/login.html");
		    	}
		    }
				return false;
	}

}
