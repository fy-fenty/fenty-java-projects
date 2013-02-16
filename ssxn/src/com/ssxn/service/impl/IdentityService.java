package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IIdentityDAO;
import com.ssxn.model.Identity;
import com.ssxn.service.IIdentityService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class IdentityService implements IIdentityService {

	@Resource
	private IIdentityDAO identityDAO;

	@Override
	public Identity getIdentityById(Integer iid) {
		return identityDAO.get(iid);
	}

	@Override
	public void saveIdentity(Identity ide) {
		identityDAO.save(ide);
	}

	@Override
	public void delIdentityById(Integer iid) {
		identityDAO.delete(iid);

	}

	@Override
	public Page findAllIdentity(BaseVO bv) {
		return identityDAO.findAll(bv);
	}

	public IIdentityDAO getIdentityDAO() {
		return identityDAO;
	}

	public void setIdentityDAO(IIdentityDAO identityDAO) {
		this.identityDAO = identityDAO;
	}

}