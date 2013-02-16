package com.ssxn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Morder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private Integer cid;
	private Float frontMoney;
	private Date frontMoneyDate;
	private Integer brideConsultant;
	private String memberNo;
	private Float setMealPrice;
	private Float spareMoney;
	private Date spareMoneyDate;
	private String remark;
	private String outShooting;
	private String innerShooting;
	private String shootDress;
	private String choicenessPic;
	private String weddingDay;
	private String productContent;
	private String marryServiceForDay;
	private Integer memberScore;
	private String brideConsultantEvaluateForClient;
	private String totalityServiceForClient;

	public Morder() {
	}

	public Morder(Integer oid) {
		this.oid = oid;
	}

	public Morder(Integer oid, Integer cid, Float frontMoney, Date frontMoneyDate, Integer brideConsultant,
			String memberNo, Float setMealPrice, Float spareMoney, Date spareMoneyDate, String remark,
			String outShooting, String innerShooting, String shootDress, String choicenessPic, String weddingDay,
			String productContent, String marryServiceForDay, Integer memberScore,
			String brideConsultantEvaluateForClient, String totalityServiceForClient) {
		this.oid = oid;
		this.cid = cid;
		this.frontMoney = frontMoney;
		this.frontMoneyDate = frontMoneyDate;
		this.brideConsultant = brideConsultant;
		this.memberNo = memberNo;
		this.setMealPrice = setMealPrice;
		this.spareMoney = spareMoney;
		this.spareMoneyDate = spareMoneyDate;
		this.remark = remark;
		this.outShooting = outShooting;
		this.innerShooting = innerShooting;
		this.shootDress = shootDress;
		this.choicenessPic = choicenessPic;
		this.weddingDay = weddingDay;
		this.productContent = productContent;
		this.marryServiceForDay = marryServiceForDay;
		this.memberScore = memberScore;
		this.brideConsultantEvaluateForClient = brideConsultantEvaluateForClient;
		this.totalityServiceForClient = totalityServiceForClient;
	}

	public Integer getOid() {
		return this.oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Float getFrontMoney() {
		return this.frontMoney;
	}

	public void setFrontMoney(Float frontMoney) {
		this.frontMoney = frontMoney;
	}

	public Date getFrontMoneyDate() {
		return this.frontMoneyDate;
	}

	public void setFrontMoneyDate(Date frontMoneyDate) {
		this.frontMoneyDate = frontMoneyDate;
	}

	public Integer getBrideConsultant() {
		return this.brideConsultant;
	}

	public void setBrideConsultant(Integer brideConsultant) {
		this.brideConsultant = brideConsultant;
	}

	public String getMemberNo() {
		return this.memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public Float getSetMealPrice() {
		return this.setMealPrice;
	}

	public void setSetMealPrice(Float setMealPrice) {
		this.setMealPrice = setMealPrice;
	}

	public Float getSpareMoney() {
		return this.spareMoney;
	}

	public void setSpareMoney(Float spareMoney) {
		this.spareMoney = spareMoney;
	}

	public Date getSpareMoneyDate() {
		return this.spareMoneyDate;
	}

	public void setSpareMoneyDate(Date spareMoneyDate) {
		this.spareMoneyDate = spareMoneyDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOutShooting() {
		return this.outShooting;
	}

	public void setOutShooting(String outShooting) {
		this.outShooting = outShooting;
	}

	public String getInnerShooting() {
		return this.innerShooting;
	}

	public void setInnerShooting(String innerShooting) {
		this.innerShooting = innerShooting;
	}

	public String getShootDress() {
		return this.shootDress;
	}

	public void setShootDress(String shootDress) {
		this.shootDress = shootDress;
	}

	public String getChoicenessPic() {
		return this.choicenessPic;
	}

	public void setChoicenessPic(String choicenessPic) {
		this.choicenessPic = choicenessPic;
	}

	public String getWeddingDay() {
		return this.weddingDay;
	}

	public void setWeddingDay(String weddingDay) {
		this.weddingDay = weddingDay;
	}

	public String getProductContent() {
		return this.productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}

	public String getMarryServiceForDay() {
		return this.marryServiceForDay;
	}

	public void setMarryServiceForDay(String marryServiceForDay) {
		this.marryServiceForDay = marryServiceForDay;
	}

	public Integer getMemberScore() {
		return this.memberScore;
	}

	public void setMemberScore(Integer memberScore) {
		this.memberScore = memberScore;
	}

	public String getBrideConsultantEvaluateForClient() {
		return this.brideConsultantEvaluateForClient;
	}

	public void setBrideConsultantEvaluateForClient(String brideConsultantEvaluateForClient) {
		this.brideConsultantEvaluateForClient = brideConsultantEvaluateForClient;
	}

	public String getTotalityServiceForClient() {
		return this.totalityServiceForClient;
	}

	public void setTotalityServiceForClient(String totalityServiceForClient) {
		this.totalityServiceForClient = totalityServiceForClient;
	}

}