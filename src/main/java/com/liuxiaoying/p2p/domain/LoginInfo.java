package com.liuxiaoying.p2p.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_loginInfo")
public class LoginInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lid;
	private String userName;
	private String password;
	public int getUid() {
		return lid;
	}
	public void setUid(int lid) {
		this.lid = lid;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginInfo() {
		super();
	}
	public LoginInfo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public LoginInfo(int uid, String userName, String password) {
		super();
		this.lid = uid;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginInfo [lid=" + lid + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
