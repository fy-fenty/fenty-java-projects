package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IClientshootDAO;
import com.ssxn.model.Clientshoot;
import com.ssxn.service.IClientshootService;
import com.ssxn.support.BaseVO;
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
	public Page findClientshootByUid(BaseVO pg, Integer uid) {
		return clientshootDAO.findPage(pg, "from ", uid);
	}

	public IClientshootDAO getClientshootDAO() {
		return clientshootDAO;
	}

	public void setClientshootDAO(IClientshootDAO clientshootDAO) {
		this.clientshootDAO = clientshootDAO;
	}

}
