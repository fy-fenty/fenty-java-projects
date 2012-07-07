package org.fengyao.vos;

public final class LoginVo {
	private String muname;
	private String mupwd;

	public LoginVo() {
		super();
	}

	public LoginVo(String muname, String mupwd) {
		super();
		this.muname = muname;
		this.mupwd = mupwd;
	}

	public String getMuname() {
		return muname;
	}

	public void setMuname(String muname) {
		this.muname = muname;
	}

	public String getMupwd() {
		return mupwd;
	}

	public void setMupwd(String mupwd) {
		this.mupwd = mupwd;
	}

}
