package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IClientchooseDAO;
import com.ssxn.model.Clientchoose;
import com.ssxn.service.IClientchooseService;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

@Component
public class ClientchooseService implements IClientchooseService {

	@Resource
	private IClientchooseDAO clientchooseDAO;

	@Override
	public Clientchoose getClientchooseById(Integer cid) {
		return clientchooseDAO.get(cid);
	}

	@Override
	public void saveClientchoose(Clientchoose cc) {
		clientchooseDAO.save(cc);
	}

	@Override
	public Page findClientchooseByUid(BasePageVO bv, Integer uid) {
		return clientchooseDAO.findPage(bv, "from " + clientchooseDAO.getTableName() + " where uid=?", uid);
	}

	@Override
	public Page findAllClientchoose(BasePageVO pv) {
		return clientchooseDAO.findAll(pv);
	}

	public IClientchooseDAO getClientchooseDAO() {
		return clientchooseDAO;
	}

	public void setClientchooseDAO(IClientchooseDAO clientchooseDAO) {
		this.clientchooseDAO = clientchooseDAO;
	}
}