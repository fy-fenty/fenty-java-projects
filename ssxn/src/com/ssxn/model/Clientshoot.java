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
public class Clientshoot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rid;
	private Integer uid;
	private Date shootDate;
	private String cosmeticConsum;
	private String cameramanEvaluate;
	private String dresserEvaluate;
	private String cameramanComment;
	private String dresserComment;

	public Clientshoot() {
	}

	public Clientshoot(Integer rid) {
		this.rid = rid;
	}

	public Clientshoot(Integer rid, Integer uid, Date shootDate, String cosmeticConsum, String cameramanEvaluate,
			String dresserEvaluate, String cameramanComment, String dresserComment) {
		this.rid = rid;
		this.uid = uid;
		this.shootDate = shootDate;
		this.cosmeticConsum = cosmeticConsum;
		this.cameramanEvaluate = cameramanEvaluate;
		this.dresserEvaluate = dresserEvaluate;
		this.cameramanComment = cameramanComment;
		this.dresserComment = dresserComment;
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

	public Date getShootDate() {
		return this.shootDate;
	}

	public void setShootDate(Date shootDate) {
		this.shootDate = shootDate;
	}

	public String getCosmeticConsum() {
		return this.cosmeticConsum;
	}

	public void setCosmeticConsum(String cosmeticConsum) {
		this.cosmeticConsum = cosmeticConsum;
	}

	public String getCameramanEvaluate() {
		return this.cameramanEvaluate;
	}

	public void setCameramanEvaluate(String cameramanEvaluate) {
		this.cameramanEvaluate = cameramanEvaluate;
	}

	public String getDresserEvaluate() {
		return this.dresserEvaluate;
	}

	public void setDresserEvaluate(String dresserEvaluate) {
		this.dresserEvaluate = dresserEvaluate;
	}

	public String getCameramanComment() {
		return this.cameramanComment;
	}

	public void setCameramanComment(String cameramanComment) {
		this.cameramanComment = cameramanComment;
	}

	public String getDresserComment() {
		return this.dresserComment;
	}

	public void setDresserComment(String dresserComment) {
		this.dresserComment = dresserComment;
	}

}