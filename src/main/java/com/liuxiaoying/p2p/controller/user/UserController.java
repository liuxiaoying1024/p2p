package com.liuxiaoying.p2p.controller.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/userInfo")
	public ModelAndView userInfo(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userInfo");
		
		return mv;
	}
	
	@RequestMapping("/realAuth")
	public ModelAndView realAuth(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("realAuth");
		
		return mv;
	}
	
	@RequestMapping("/userFile")
	public ModelAndView userFile(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userFiles");
		
		return mv;
	}
	
	@RequestMapping("/ipLog")
	public ModelAndView ipLog(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("iplog_list");
		
		return mv;
	}
}
