package com.facingsea.dubbo.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 * @author wangzhf
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -6833823266522155318L;

	private Integer id;
	
	private String username;
	
	private String password;
	
	private Date createDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", createDate=" + createDate + "]";
	}
	
}
