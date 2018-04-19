package controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.AdminBiz;
import entity.Admin;

@Controller
public class AdminController {
	@Resource
	private AdminBiz adminBiz;
	
	@RequestMapping("login.show")
	public String showindex(){
		return "login";
	}
	
	@RequestMapping("login.do")
	public String login(HttpServletRequest request,Model mode){
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		Admin admin=adminBiz.findoneadmin(name, pwd);
		mode.addAttribute("Admin", admin);
		return "index";
	}
}
