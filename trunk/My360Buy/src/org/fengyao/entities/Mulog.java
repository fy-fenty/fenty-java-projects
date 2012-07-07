package org.fengyao.entities;

import java.util.Date;

/**
 * Mulog entity. @author MyEclipse Persistence Tools
 */

public class Mulog implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 6496127861035583090L;
	private Integer mlid;
	private String mlcontent;
	private Date mldata;

	// Constructors

	/** default constructor */
	public Mulog() {
	}

	/** minimal constructor */
	public Mulog(Integer mlid, Date mldata) {
		this.mlid = mlid;
		this.mldata = mldata;
	}

	/** full constructor */
	public Mulog(Integer mlid, String mlcontent, Date mldata) {
		this.mlid = mlid;
		this.mlcontent = mlcontent;
		this.mldata = mldata;
	}

	// Property accessors

	public Integer getMlid() {
		return this.mlid;
	}

	public void setMlid(Integer mlid) {
		this.mlid = mlid;
	}

	public String getMlcontent() {
		return this.mlcontent;
	}

	public void setMlcontent(String mlcontent) {
		this.mlcontent = mlcontent;
	}

	public Date getMldata() {
		return this.mldata;
	}

	public void setMldata(Date mldata) {
		this.mldata = mldata;
	}

}