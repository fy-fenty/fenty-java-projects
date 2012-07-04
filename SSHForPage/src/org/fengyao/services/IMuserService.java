package org.fengyao.services;

import java.util.List;

import org.fengyao.entities.Muser;
import org.fengyao.entities.PageBean;
import org.hibernate.Session;

public interface IMuserService {
	public Muser findMuserByNameAndPwd(String mname, String mpwd);

	public List findAllMuser();

	public Muser addMuser(Muser muser);
	
	public PageBean getPageBean(int start, int limit);
}
