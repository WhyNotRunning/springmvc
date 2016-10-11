package com.iwooto.controller;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iwooto.annotation.CurrentUser;
import com.iwooto.common.BaseController;
import com.iwooto.entity.SysResource;
import com.iwooto.entity.SysUser;
import com.iwooto.service.ResourceService;
import com.iwooto.service.UserService;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class HomeController extends BaseController{

	private final String HOME = "index";
	private  static String WEBSOCKET = "websocket";
	

    @Autowired
    private ResourceService resourceService;
    @Autowired
    private UserService userService;

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
    public String nav(@CurrentUser SysUser loginUser, Model model) throws Exception {
        Set<String> permissions = userService.findPermissions(loginUser.getUsername());
        List<SysResource> menus = resourceService.findMenus(permissions);
        model.addAttribute("menuList", menus);
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
