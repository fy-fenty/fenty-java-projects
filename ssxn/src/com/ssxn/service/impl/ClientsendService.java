package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IClientsendDAO;
import com.ssxn.model.Clientsend;
import com.ssxn.service.IClientsendService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class ClientsendService implements IClientsendService {

	@Resource
	private IClientsendDAO clientsendDAO;
	
	@Override
	public Clientsend getClientsendById(Integer cid) {
		return clientsendDAO.get(cid);
	}

	@Override
	public void saveClientsend(Clientsend cc) {
		clientsendDAO.save(cc);
	}

	@Override
	public Page findClientsendByUid(BaseVO bv, Integer uid) {
		return clientsendDAO.findPage(bv, "from "+clientsendDAO.getTableName(), uid);
	}

	public IClientsendDAO getClientsendDAO() {
		return clientsendDAO;
	}

	public void setClientsendDAO(IClientsendDAO clientsendDAO) {
		this.clientsendDAO = clientsendDAO;
	}

}
