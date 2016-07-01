package com.iwooto.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	


    @RequestMapping("/")
    public String index(Model model) throws Exception {
        return "index";
    }
	
    @RequestMapping(value = "/top")
    public String index() {
        return "main/top";
    }

    @RequestMapping(value = "/welcome")
    public String welcome() {
        return "main/welcome";
    }
    
    @RequestMapping(value = "/nav")
    public String nav(HttpSession session, Model model) throws Exception {
//    	String username = (String) SecurityUtils.getSubject().getPrincipal();
//    	User user = this.userService.getUserByName(username);
//        List<GroupAndResource> grList = this.grService.getResource(user.getGroup().getId());
//        List<Resource> menus = this.resourceService.getMenus(grList);
//        model.addAttribute("menuList", menus);
    	return "main/nav";
    }
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
