package com.ssxn.service;

import com.ssxn.model.Morder;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IMorderService {
	public Morder getMorderById(Integer oid);

	public void saveMorder(Morder mo);

	public Page finMorderByUid(BasePageVO bv, Integer uid);
	
	public Page findAllMorder(BasePageVO bv);
}