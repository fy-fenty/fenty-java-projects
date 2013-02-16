package com.ssxn.service;

import com.ssxn.model.Clientlook;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IClientlookService {
	public Clientlook getClientlookById(Integer cid);

	public void saveClientlook(Clientlook cc);

	public Page findClientlookByUid(BaseVO bv, Integer uid);

}