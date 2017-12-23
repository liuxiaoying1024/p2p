package com.liuxiaoying.p2p.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.liuxiaoying.p2p.dao.TestDao;
import com.liuxiaoying.p2p.domain.Test;

@Service
@Transactional
public class TestService {
	@Resource
	private TestDao testDao;
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public Test getName(){
		System.out.println("service");
		return testDao.getName();
	}
}
