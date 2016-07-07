package com.iwooto.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iwooto.service.SysUserService;

@Controller
@RequestMapping("/loAction")
public class TestAction {

	private SysUserService userService;
	
	@RequestMapping(value = "/test")
    public String showLoginForm(HttpServletRequest req, Model model) {
		userService.findByUsername("");
        return "login";
    }
	
}
