package org.fengyao.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Vote entity. @author MyEclipse Persistence Tools
 */

public class Vote implements java.io.Serializable {

	// Fields

	private Short vid;
	private String vtitle;
	private String vcontent;
	private Set voteOptions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** minimal constructor */
	public Vote(Short vid) {
		this.vid = vid;
	}

	/** full constructor */
	public Vote(Short vid, String vtitle, String vcontent, Set voteOptions) {
		this.vid = vid;
		this.vtitle = vtitle;
		this.vcontent = vcontent;
		this.voteOptions = voteOptions;
	}

	// Property accessors

	public Short getVid() {
		return this.vid;
	}

	public void setVid(Short vid) {
		this.vid = vid;
	}

	public String getVtitle() {
		return this.vtitle;
	}

	public void setVtitle(String vtitle) {
		this.vtitle = vtitle;
	}

	public String getVcontent() {
		return this.vcontent;
	}

	public void setVcontent(String vcontent) {
		this.vcontent = vcontent;
	}

	public Set getVoteOptions() {
		return this.voteOptions;
	}

	public void setVoteOptions(Set voteOptions) {
		this.voteOptions = voteOptions;
	}

}