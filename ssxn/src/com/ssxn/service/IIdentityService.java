package com.ssxn.service;

import com.ssxn.model.Identity;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IIdentityService {
	public Identity getIdentityById(Integer iid);

	public void saveIdentity(Identity ide);

	public void delIdentityById(Integer iid);

	public Page findAllIdentity(BasePageVO bv);
}