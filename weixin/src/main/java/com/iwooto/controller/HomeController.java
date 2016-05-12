package com.iwooto.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iwooto.common.BaseController;

/**
 * 
 * @author Administrator
 *
 */
@RequestMapping("")
@Controller
public class HomeController extends BaseController{

	private final String HOME = "index";
	private  static String WEBSOCKET = "websocket";
	
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView(HOME);
		return mav;
	}
	


	@RequestMapping(value="/toWebsocket")
	public ModelAndView toEdit(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mav = new ModelAndView();
		mav.setViewName(WEBSOCKET);
		return mav;
	}
}
