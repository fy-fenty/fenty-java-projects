package com.ssxn.vo;

public class LoginVo {
	private String uname;
	private String upwd;

	public LoginVo() {
		super();
		this.uname = "anonymous";
		this.upwd = "anonymous";
	}

	public LoginVo(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
