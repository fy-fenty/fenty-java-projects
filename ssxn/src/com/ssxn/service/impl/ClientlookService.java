package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IClientlookDAO;
import com.ssxn.model.Clientlook;
import com.ssxn.service.IClientlookService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class ClientlookService implements IClientlookService {

	@Resource
	private IClientlookDAO clientlookDAO;

	@Override
	public Clientlook getClientlookById(Integer cid) {
		return clientlookDAO.get(cid);
	}

	@Override
	public void saveClientlook(Clientlook cc) {
		clientlookDAO.save(cc);

	}

	@Override
	public Page findClientlookByUid(BaseVO bv, Integer uid) {
		return clientlookDAO.findPage(bv, "from " + clientlookDAO.getTableName() + " where uid=?", uid);
	}

	public IClientlookDAO getClientlookDAO() {
		return clientlookDAO;
	}

	public void setClientlookDAO(IClientlookDAO clientlookDAO) {
		this.clientlookDAO = clientlookDAO;
	}

}
