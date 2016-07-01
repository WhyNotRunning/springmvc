package com.iwooto.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserInteceptor extends HandlerInterceptorAdapter{
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		/*String uri = request.getRequestURI();
		System.out.println("==>==>uri==>==>:"+uri);
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8"); 		
		Users u=(Users)request.getSession().getAttribute(ConstantStr.LOGIN_SESSION_KEY);
		if (null!=u) {
			return true;
		} else {
            PrintWriter out = response.getWriter();  
            StringBuilder builder = new StringBuilder();  
            builder.append("<script type=\"text/javascript\" charset=\"UTF-8\">");  
            builder.append("alert(\"页面过期，请重新登录!\");");  
            builder.append("window.top.location.href=\"");  
            builder.append(request.getContextPath());
            builder.append("/login\";</script>");  
            out.print(builder.toString());  
            out.close(); 			
			return false;
		}*/
		return true;
	}
}
