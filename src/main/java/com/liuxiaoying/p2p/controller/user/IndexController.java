package com.liuxiaoying.p2p.controller.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView invest(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		
		return mv;
	}
}
