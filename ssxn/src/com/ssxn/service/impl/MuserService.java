package com.ssxn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMuserDAO;
import com.ssxn.model.Muser;
import com.ssxn.service.IMuserService;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

@Component
public class MuserService implements IMuserService {

	@Resource
	private IMuserDAO muserDAO;

	public Muser getMuser(Object... args) {
		return null;
	}

	@Override
	public Muser getMuserById(Integer uid) {
		return muserDAO.get(uid);
	}

	@Override
	public void saveMuser(Muser mu) {
		muserDAO.save(mu);

	}

	@Override
	public List<Muser> findMuserByName(String uname) {
		return muserDAO.find("from Muser where uname = ?", uname);
	}

	@Override
	public Page findAllMuser(BasePageVO bpVo) {
		return muserDAO.findAll(bpVo);
	}

	public IMuserDAO getMuserDAO() {
		return muserDAO;
	}

	public void setMuserDAO(IMuserDAO muserDAO) {
		this.muserDAO = muserDAO;
	}

}
