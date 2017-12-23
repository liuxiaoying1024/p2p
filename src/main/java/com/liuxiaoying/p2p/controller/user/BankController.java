package com.liuxiaoying.p2p.controller.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class BankController {
	
	@RequestMapping("/bank")
	public ModelAndView bankInfo(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bankInfo");
		
		return mv;
	}
}
