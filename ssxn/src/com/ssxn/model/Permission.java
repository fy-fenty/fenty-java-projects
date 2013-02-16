package com.ssxn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Permission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private String pename;
	private String pzname;

	public Permission() {
	}

	public Permission(Integer pid) {
		this.pid = pid;
	}

	public Permission(Integer pid, String pename, String pzname) {
		this.pid = pid;
		this.pename = pename;
		this.pzname = pzname;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPename() {
		return pename;
	}

	public void setPename(String pename) {
		this.pename = pename;
	}

	public String getPzname() {
		return pzname;
	}

	public void setPzname(String pzname) {
		this.pzname = pzname;
	}

}