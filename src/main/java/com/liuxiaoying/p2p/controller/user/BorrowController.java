package com.liuxiaoying.p2p.controller.user;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class BorrowController {
	
	@RequestMapping("/borrow")
	public ModelAndView borrow(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("borrow");
		
		return mv;
	}
	
	@RequestMapping("/borrowApply")
	public ModelAndView borrowApply(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("borrow_apply");
		
		return mv;
	}
	
	@RequestMapping("/borrowInfo")
	public ModelAndView borrowInfo(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("borrow_info");
		
		return mv;
	}
}
