package org.fengyao.entities;

/**
 * Muser entity. @author MyEclipse Persistence Tools
 */

public class Muser implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -4917192050525152934L;
	private Integer muid;
	private String muname;
	private String mupwd;

	// Constructors

	/** default constructor */
	public Muser() {
	}

	/** full constructor */
	public Muser(Integer muid, String muname, String mupwd) {
		this.muid = muid;
		this.muname = muname;
		this.mupwd = mupwd;
	}

	// Property accessors

	public Integer getMuid() {
		return this.muid;
	}

	public void setMuid(Integer muid) {
		this.muid = muid;
	}

	public String getMuname() {
		return this.muname;
	}

	public void setMuname(String muname) {
		this.muname = muname;
	}

	public String getMupwd() {
		return this.mupwd;
	}

	public void setMupwd(String mupwd) {
		this.mupwd = mupwd;
	}

}