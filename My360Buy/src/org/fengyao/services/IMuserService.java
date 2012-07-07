package org.fengyao.services;

import org.fengyao.entities.Muser;

public interface IMuserService {
	public Muser login(String muname, String mupwd);
}