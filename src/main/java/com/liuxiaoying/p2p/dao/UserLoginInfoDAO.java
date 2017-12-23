package com.liuxiaoying.p2p.dao;


import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.liuxiaoying.p2p.domain.LoginInfo;
import com.liuxiaoying.p2p.exection.LoginInfoException;

@Repository
@Transactional
public class UserLoginInfoDAO {

	@Resource
	private HibernateTemplate hibernateTemplate;

	public void reguster(LoginInfo loginInfo) throws LoginInfoException{
		
		hibernateTemplate.save(loginInfo);
	}

	public LoginInfo getLoginInfo(String userName){
		
		String hql = "FROM LoginInfo l WHERE l.userName=?";
		LoginInfo loginInfo;
		try {
			loginInfo = (LoginInfo) hibernateTemplate.find(hql, userName).get(0);
		} catch (Exception e) {
			loginInfo =null;
		}
		
		return loginInfo;
	}

	
	
}
