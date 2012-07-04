package org.fengyao.daos;

import java.util.List;

import org.fengyao.entities.Muser;

@SuppressWarnings("rawtypes")
public class MuserDao extends BaseDao<Muser> {

	public String findNameByName(String mname) {
		return null;
	}

	public Muser addMuser(String mname, String npwd) {
		return null;
	}

	public String getPwdByName(String mname) {
		return null;
	}

	public Muser findMuserByNameAndPwd(String mname, String mpwd) {
		return null;
	}

	public List findAllMuser() {
		return super.findAll();
	}
}