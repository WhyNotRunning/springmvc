package com.iwooto.websocket;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import com.iwooto.common.ConstantStr;
import com.iwooto.entity.SysUser;

public class WebSocketHandshakeInterceptor implements HandshakeInterceptor {
	 
    private static Logger logger = Logger.getLogger(HandshakeInterceptor.class);
    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object
                > attributes) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
            HttpSession session = servletRequest.getServletRequest().getSession(false);
            if (session != null) {
                //使用userid区分WebSocketHandler，以便定向发送消息
            	SysUser user = (SysUser) session.getAttribute(ConstantStr.LOGIN_SESSION_KEY);
                attributes.put(ConstantStr.LOGIN_SESSION_KEY,user.getId());
            }
        }
        return true;
    }
 
    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
 
    }
}