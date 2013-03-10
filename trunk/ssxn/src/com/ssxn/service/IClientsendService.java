package com.ssxn.service;

import com.ssxn.model.Clientsend;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IClientsendService {
	public Clientsend getClientsendById(Integer cid);

	public void saveClientsend(Clientsend cc);

	public Page findClientsendByUid(BaseVO bv, Integer uid);
}
