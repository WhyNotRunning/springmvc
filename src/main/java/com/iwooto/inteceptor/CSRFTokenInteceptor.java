package com.iwooto.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.iwooto.utils.CSRFTokenManager;

public class CSRFTokenInteceptor extends HandlerInterceptorAdapter{
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		modelAndView.addObject("csrfHeaderName", "csrfHeaderName");
		modelAndView.addObject("csrfToken", CSRFTokenManager.getTokenForSession(request.getSession()));
		super.postHandle(request, response, handler, modelAndView);
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("*********************preHandle********************"); 
	    String method = request.getMethod();
	    if(method.toUpperCase().equals("GET")){
	    	return true;
	    }
		String csrfToken = request.getHeader("csrfHeaderName");
		if(csrfToken != null && csrfToken.equals(CSRFTokenManager.getTokenForSession(request.getSession()))){
			return true;
		}
	    //重定向到登录页面  
	    response.sendRedirect(request.getContextPath() + "/login");  
	    return false; 
	}
}
