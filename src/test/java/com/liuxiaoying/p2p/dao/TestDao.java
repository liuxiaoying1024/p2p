package com.liuxiaoying.p2p.dao;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.liuxiaoying.p2p.domain.Test;

@Repository
@Transactional
public class TestDao {
	@Resource
	private HibernateTemplate hibernateTemplate;

	public Test getName() {
		System.out.println("dao........");
		return hibernateTemplate.get(Test.class,1);
	}
	
}
