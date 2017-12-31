package com.demo.dao;

public class LoginDaoData {
	public String url;
	public String username;
	public String password;
	public String sql;

	public LoginDaoData(String url, String username, String password, String sql) {
		this.url = url;
		this.username = username;
		this.password = password;
		this.sql = sql;
	}
}