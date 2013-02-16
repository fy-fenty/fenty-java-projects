package com.ssxn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Clientchoose {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private Integer uid;
	private Boolean repairIng;
	private Date sendDate;
	private Boolean alreadyAdvice;
	private Date chooseDate;
	private Integer originalPicNum;
	private Integer addPicNum;
	private Integer lastPicNum;
	private String chooseOutlets;
	private Float laterMoney;
	private Float balance;
	private String endProduct;
	private String serviceComment;

	public Clientchoose() {
	}

	public Clientchoose(Integer rid) {
		this.rid = rid;
	}

	public Clientchoose(Integer rid, Integer uid, Boolean repairIng, Date sendDate, Boolean alreadyAdvice,
			Date chooseDate, Integer originalPicNum, Integer addPicNum, Integer lastPicNum, String chooseOutlets,
			Float laterMoney, Float balance, String endProduct, String serviceComment) {
		this.rid = rid;
		this.uid = uid;
		this.repairIng = repairIng;
		this.sendDate = sendDate;
		this.alreadyAdvice = alreadyAdvice;
		this.chooseDate = chooseDate;
		this.originalPicNum = originalPicNum;
		this.addPicNum = addPicNum;
		this.lastPicNum = lastPicNum;
		this.chooseOutlets = chooseOutlets;
		this.laterMoney = laterMoney;
		this.balance = balance;
		this.endProduct = endProduct;
		this.serviceComment = serviceComment;
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

	public Boolean getRepairIng() {
		return this.repairIng;
	}

	public void setRepairIng(Boolean repairIng) {
		this.repairIng = repairIng;
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

	public Date getChooseDate() {
		return this.chooseDate;
	}

	public void setChooseDate(Date chooseDate) {
		this.chooseDate = chooseDate;
	}

	public Integer getOriginalPicNum() {
		return this.originalPicNum;
	}

	public void setOriginalPicNum(Integer originalPicNum) {
		this.originalPicNum = originalPicNum;
	}

	public Integer getAddPicNum() {
		return this.addPicNum;
	}

	public void setAddPicNum(Integer addPicNum) {
		this.addPicNum = addPicNum;
	}

	public Integer getLastPicNum() {
		return this.lastPicNum;
	}

	public void setLastPicNum(Integer lastPicNum) {
		this.lastPicNum = lastPicNum;
	}

	public String getChooseOutlets() {
		return this.chooseOutlets;
	}

	public void setChooseOutlets(String chooseOutlets) {
		this.chooseOutlets = chooseOutlets;
	}

	public Float getLaterMoney() {
		return this.laterMoney;
	}

	public void setLaterMoney(Float laterMoney) {
		this.laterMoney = laterMoney;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getEndProduct() {
		return this.endProduct;
	}

	public void setEndProduct(String endProduct) {
		this.endProduct = endProduct;
	}

	public String getServiceComment() {
		return this.serviceComment;
	}

	public void setServiceComment(String serviceComment) {
		this.serviceComment = serviceComment;
	}

}