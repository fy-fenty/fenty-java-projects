package org.fengyao.services.impls;

import java.util.List;

import org.fengyao.daos.MuserDao;
import org.fengyao.entities.Muser;
import org.fengyao.entities.PageBean;
import org.fengyao.services.IMuserService;

public class MuserService implements IMuserService {
	private MuserDao muserDao;

	@Override
	public Muser findMuserByNameAndPwd(String mname, String mpwd) {
		return muserDao.findMuserByNameAndPwd(mname, mpwd);
	}

	@Override
	public List findAllMuser() {
		return muserDao.findAllMuser();
	}

	@Override
	public Muser addMuser(Muser muser) {
		return null;
	}

	@Override
	public PageBean getPageBean(int start, int limit) {
		PageBean pb = new PageBean(start, limit, muserDao.getSessionFactory().getCurrentSession());
		return pb;
	}

	public MuserDao getMuserDao() {
		return muserDao;
	}

	public void setMuserDao(MuserDao muserDao) {
		this.muserDao = muserDao;
	}
}