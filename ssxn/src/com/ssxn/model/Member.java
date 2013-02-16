package com.ssxn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mid;
	private Integer uid;
	private String mno;
	private Double mscore;

	public Member() {
	}

	public Member(Integer mid) {
		this.mid = mid;
	}

	public Member(Integer mid, Integer uid, String mno, Double mscore) {
		this.mid = mid;
		this.uid = uid;
		this.mno = mno;
		this.mscore = mscore;
	}

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getMno() {
		return this.mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public Double getMscore() {
		return this.mscore;
	}

	public void setMscore(Double mscore) {
		this.mscore = mscore;
	}

}