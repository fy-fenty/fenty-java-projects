package com.ssxn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Clientsend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private Integer uid;
	private Date sendDate;
	private Boolean alreadySure;
	private Boolean alreadyAdvice;
	private String adviceOn;
	private String adviceTw;
	private String adviceTh;
	private String sendFactoryContent;
	private String returnTimes;
	private Date clientGetTime;
	private String clientAlreadyGet;
	private Date clientGetAllOnDate;
	private String oweProduct;
	private String clientContentOnToday;

	public Clientsend() {
	}

	public Clientsend(Integer rid) {
		this.rid = rid;
	}

	public Clientsend(Integer rid, Integer uid, Date sendDate, Boolean alreadySure, Boolean alreadyAdvice,
			String adviceOn, String adviceTw, String adviceTh, String sendFactoryContent, String returnTimes,
			Date clientGetTime, String clientAlreadyGet, Date clientGetAllOnDate, String oweProduct,
			String clientContentOnToday) {
		this.rid = rid;
		this.uid = uid;
		this.sendDate = sendDate;
		this.alreadySure = alreadySure;
		this.alreadyAdvice = alreadyAdvice;
		this.adviceOn = adviceOn;
		this.adviceTw = adviceTw;
		this.adviceTh = adviceTh;
		this.sendFactoryContent = sendFactoryContent;
		this.returnTimes = returnTimes;
		this.clientGetTime = clientGetTime;
		this.clientAlreadyGet = clientAlreadyGet;
		this.clientGetAllOnDate = clientGetAllOnDate;
		this.oweProduct = oweProduct;
		this.clientContentOnToday = clientContentOnToday;
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

	public Date getSendDate() {
		return this.sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Boolean getAlreadySure() {
		return this.alreadySure;
	}

	public void setAlreadySure(Boolean alreadySure) {
		this.alreadySure = alreadySure;
	}

	public Boolean getAlreadyAdvice() {
		return this.alreadyAdvice;
	}

	public void setAlreadyAdvice(Boolean alreadyAdvice) {
		this.alreadyAdvice = alreadyAdvice;
	}

	public String getAdviceOn() {
		return this.adviceOn;
	}

	public void setAdviceOn(String adviceOn) {
		this.adviceOn = adviceOn;
	}

	public String getAdviceTw() {
		return this.adviceTw;
	}

	public void setAdviceTw(String adviceTw) {
		this.adviceTw = adviceTw;
	}

	public String getAdviceTh() {
		return this.adviceTh;
	}

	public void setAdviceTh(String adviceTh) {
		this.adviceTh = adviceTh;
	}

	public String getSendFactoryContent() {
		return this.sendFactoryContent;
	}

	public void setSendFactoryContent(String sendFactoryContent) {
		this.sendFactoryContent = sendFactoryContent;
	}

	public String getReturnTimes() {
		return this.returnTimes;
	}

	public void setReturnTimes(String returnTimes) {
		this.returnTimes = returnTimes;
	}

	public Date getClientGetTime() {
		return this.clientGetTime;
	}

	public void setClientGetTime(Date clientGetTime) {
		this.clientGetTime = clientGetTime;
	}

	public String getClientAlreadyGet() {
		return this.clientAlreadyGet;
	}

	public void setClientAlreadyGet(String clientAlreadyGet) {
		this.clientAlreadyGet = clientAlreadyGet;
	}

	public Date getClientGetAllOnDate() {
		return this.clientGetAllOnDate;
	}

	public void setClientGetAllOnDate(Date clientGetAllOnDate) {
		this.clientGetAllOnDate = clientGetAllOnDate;
	}

	public String getOweProduct() {
		return this.oweProduct;
	}

	public void setOweProduct(String oweProduct) {
		this.oweProduct = oweProduct;
	}

	public String getClientContentOnToday() {
		return this.clientContentOnToday;
	}

	public void setClientContentOnToday(String clientContentOnToday) {
		this.clientContentOnToday = clientContentOnToday;
	}

}