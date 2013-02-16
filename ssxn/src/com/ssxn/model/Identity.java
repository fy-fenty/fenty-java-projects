package com.ssxn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Identity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iid;
	private String iname;

	public Identity() {
	}

	public Identity(Integer iid) {
		this.iid = iid;
	}

	public Identity(Integer iid, String iname) {
		this.iid = iid;
		this.iname = iname;
	}

	public Integer getIid() {
		return this.iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getIname() {
		return this.iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

}