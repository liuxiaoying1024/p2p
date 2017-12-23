package com.liuxiaoying.p2p.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liuxiaoying.p2p.domain.Test;
import com.liuxiaoying.p2p.service.TestService;

@Controller
@Scope("prototype")
public class TestController {
	@Resource
	private TestService testService;
	
	@RequestMapping("/testAction")
	public ModelAndView testAction(){
		System.out.println("controller...");
		Test name = testService.getName();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		mv.addObject("name",name);
		
		return mv;
	}
}
