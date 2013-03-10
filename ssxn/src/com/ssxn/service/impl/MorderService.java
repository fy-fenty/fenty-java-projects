package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMorderDAO;
import com.ssxn.model.Morder;
import com.ssxn.service.IMorderService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class MorderService implements IMorderService {

	@Resource
	private IMorderDAO morderDAO;

	@Override
	public Morder getMorderById(Integer oid) {
		return morderDAO.get(oid);
	}

	@Override
	public void saveMorder(Morder mo) {
		morderDAO.save(mo);

	}

	@Override
	public Page finMorderByUid(BaseVO bv,Integer uid) {
		return null;
	}

	public IMorderDAO getMorderDAO() {
		return morderDAO;
	}

	public void setMorderDAO(IMorderDAO morderDAO) {
		this.morderDAO = morderDAO;
	}

}