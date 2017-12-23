package com.liuxiaoying.p2p.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.liuxiaoying.p2p.dao.UserLoginInfoDAO;
import com.liuxiaoying.p2p.domain.LoginInfo;
import com.liuxiaoying.p2p.exection.LoginInfoException;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserLoginService {
	
	@Resource
	private UserLoginInfoDAO loginInfoDAO;
	
	@Transactional(rollbackFor=LoginInfoException.class)
	public void register(LoginInfo loginInfo) throws LoginInfoException{
		
		loginInfoDAO.reguster(loginInfo);
	}

	public LoginInfo getLoginIfo(String userName) throws LoginInfoException {
		// TODO Auto-generated method stub
		return loginInfoDAO.getLoginInfo(userName);
	}
	
	
}
