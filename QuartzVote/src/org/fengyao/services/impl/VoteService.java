package org.fengyao.services.impl;

import java.util.List;

import org.fengyao.daos.VoteDao;
import org.fengyao.services.IVoteService;

public class VoteService implements IVoteService {

	VoteDao vd;

	@Override
	public List getVoteTable() {
		return vd.getVoteTable();
	}

	public VoteDao getVd() {
		return vd;
	}

	public void setVd(VoteDao vd) {
		this.vd = vd;
	}

}
