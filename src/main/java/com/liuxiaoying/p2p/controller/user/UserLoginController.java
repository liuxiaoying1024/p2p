package com.liuxiaoying.p2p.controller.user;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.liuxiaoying.p2p.domain.LoginInfo;
import com.liuxiaoying.p2p.exection.LoginInfoException;
import com.liuxiaoying.p2p.service.UserLoginService;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserLoginController {
	
	@Resource
	private UserLoginService userLoginService;
	
	@RequestMapping("/login")
	public ModelAndView login(String userName) throws LoginInfoException{
		
		System.out.println(userName);
		LoginInfo loginInfo= userLoginService.getLoginIfo(userName.trim());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userInfo");
		mv.addObject(loginInfo);
		
		return mv;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(LoginInfo loginInfo) throws LoginInfoException{
		
		userLoginService.register(loginInfo);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/login.html");
		
		return mv;
	}
	
	@RequestMapping("/regNameVil")
	@ResponseBody
	public Map<String, Boolean> regVli(String userName) throws LoginInfoException{
		Map<String,Boolean> map = new HashedMap();
		
    	LoginInfo loginInfo2= userLoginService.getLoginIfo(userName.trim());
    	
    	boolean flag=loginInfo2==null?false:true;
    	map.put("msg", flag);
    		
		return map;
	}
	
	@RequestMapping("/regPwdVil")
	@ResponseBody
	public Map<String, Boolean> regVeli(LoginInfo loginInfo) throws LoginInfoException{
		Map<String, Boolean> map = new HashedMap();
		
		LoginInfo loginInfo2= userLoginService.getLoginIfo(loginInfo.getUserName().trim());
		boolean flag = false;
		
		if(loginInfo2!=null){
			if(loginInfo2.getPassword().trim().equals(loginInfo.getPassword())){
				flag=true;
			}
		}
		map.put("msg", flag);
		
		return map;
	}
}
