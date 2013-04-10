package com.ssxn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	private Integer uid;
	private String tel;
	private Integer mbi;
	private Integer qq;
	private String addr;
	private Boolean mr;
	private String pro;

	public Contact() {
	}

	public Contact(Integer cid) {
		this.cid = cid;
	}

	public Contact(Integer cid, Integer uid, String tel, int mbi, Integer qq, String addr, Boolean mr, String pro) {
		this.cid = cid;
		this.uid = uid;
		this.tel = tel;
		this.mbi = mbi;
		this.qq = qq;
		this.addr = addr;
		this.mr = mr;
		this.pro = pro;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getQq() {
		return this.qq;
	}

	public void setQq(Integer qq) {
		this.qq = qq;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Boolean getMr() {
		return this.mr;
	}

	public void setMr(Boolean mr) {
		this.mr = mr;
	}

	public String getPro() {
		return this.pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public Integer getMbi() {
		return mbi;
	}

	public void setMbi(Integer mbi) {
		this.mbi = mbi;
	}

}