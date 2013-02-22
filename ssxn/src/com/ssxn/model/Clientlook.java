package com.ssxn.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Clientlook implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private Integer uid;
	private Boolean designIng;
	private Date sendDate;
	private Boolean alreadyAdvice;
	private String adviceFirst;
	private String adviceSecond;
	private String adviceThirdly;
	private Date lookDate;
	private String changeRequire;

	public Clientlook() {
	}

	public Clientlook(Integer rid) {
		this.rid = rid;
	}

	public Clientlook(Integer rid, Integer uid, Boolean designIng, Date sendDate, Boolean alreadyAdvice,
			String adviceFirst, String adviceSecond, String adviceThirdly, Date lookDate, String changeRequire) {
		this.rid = rid;
		this.uid = uid;
		this.designIng = designIng;
		this.sendDate = sendDate;
		this.alreadyAdvice = alreadyAdvice;
		this.adviceFirst = adviceFirst;
		this.adviceSecond = adviceSecond;
		this.adviceThirdly = adviceThirdly;
		this.lookDate = lookDate;
		this.changeRequire = changeRequire;
	}

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Boolean getDesignIng() {
		return this.designIng;
	}

	public void setDesignIng(Boolean designIng) {
		this.designIng = designIng;
	}

	public Date getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Boolean getAlreadyAdvice() {
		return this.alreadyAdvice;
	}

	public void setAlreadyAdvice(Boolean alreadyAdvice) {
		this.alreadyAdvice = alreadyAdvice;
	}

	public String getAdviceFirst() {
		return this.adviceFirst;
	}

	public void setAdviceFirst(String adviceFirst) {
		this.adviceFirst = adviceFirst;
	}

	public String getAdviceSecond() {
		return this.adviceSecond;
	}

	public void setAdviceSecond(String adviceSecond) {
		this.adviceSecond = adviceSecond;
	}

	public String getAdviceThirdly() {
		return this.adviceThirdly;
	}

	public void setAdviceThirdly(String adviceThirdly) {
		this.adviceThirdly = adviceThirdly;
	}

	public Date getLookDate() {
		return this.lookDate;
	}

	public void setLookDate(Date lookDate) {
		this.lookDate = lookDate;
	}

	public String getChangeRequire() {
		return this.changeRequire;
	}

	public void setChangeRequire(String changeRequire) {
		this.changeRequire = changeRequire;
	}

}