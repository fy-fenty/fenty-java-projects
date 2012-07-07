package org.fengyao.services.impl;

import org.fengyao.daos.MuserDao;
import org.fengyao.entities.Muser;
import org.fengyao.services.IMuserService;

public class MuserServiceImpl implements IMuserService {
	private MuserDao muserDao;

	public MuserDao getMuserDao() {
		return muserDao;
	}

	public void setMuserDao(MuserDao muserDao) {
		this.muserDao = muserDao;
	}

	public Muser login(String muname, String mupwd) {
		return muserDao.findUserByNameAndPwd(muname, mupwd);
	}
}