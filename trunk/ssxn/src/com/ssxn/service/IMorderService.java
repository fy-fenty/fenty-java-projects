package com.ssxn.service;

import com.ssxn.model.Morder;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IMorderService {
	public Morder getMorderById(Integer oid);

	public void saveMorder(Morder mo);

	public Page finMorderByUid(BaseVO bv, Integer uid);
}