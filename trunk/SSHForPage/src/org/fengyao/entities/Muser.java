package org.fengyao.entities;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * Muser entity. @author MyEclipse Persistence Tools
 */

public class Muser implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 5755970097638679347L;
	private Integer mid;
	private String mname;
	private String mpwd;
	private Timestamp mdate;

	// Constructors

	/** default constructor */
	public Muser() {
	}

	/** minimal constructor */
	public Muser(Integer mid, String mpwd) {
		this.mid = mid;
		this.mpwd = mpwd;
	}

	/** full constructor */
	public Muser(Integer mid, String mname, String mpwd, Timestamp mdate) {
		this.mid = mid;
		this.mname = mname;
		this.mpwd = mpwd;
		this.mdate = mdate;
	}

	// Property accessors

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMpwd() {
		return this.mpwd;
	}

	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}

	public Timestamp getMdate() {
		return mdate;
	}

	public void setMdate(Timestamp mdate) {
		this.mdate = mdate;
	}

}