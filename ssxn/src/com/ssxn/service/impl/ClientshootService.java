package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IClientshootDAO;
import com.ssxn.model.Clientshoot;
import com.ssxn.service.IClientshootService;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

@Component
public class ClientshootService implements IClientshootService {

	@Resource
	private IClientshootDAO clientshootDAO;

	@Override
	public Clientshoot getClientshootById(Integer cid) {
		return clientshootDAO.get(cid);
	}

	@Override
	public void saveClientshoot(Clientshoot cc) {
		clientshootDAO.save(cc);
	}

	@Override
	public Page findClientshootByUid(BasePageVO pg, Integer uid) {
		return clientshootDAO.findPage(pg, "from ", uid);
	}

	@Override
	public Page findAllClientshoot(BasePageVO pv) {
		return clientshootDAO.findAll(pv);
	}

	public IClientshootDAO getClientshootDAO() {
		return clientshootDAO;
	}

	public void setClientshootDAO(IClientshootDAO clientshootDAO) {
		this.clientshootDAO = clientshootDAO;
	}
}