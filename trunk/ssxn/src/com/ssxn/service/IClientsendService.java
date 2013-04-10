package com.ssxn.service;

import com.ssxn.model.Clientsend;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IClientsendService {
	public Clientsend getClientsendById(Integer cid);

	public void saveClientsend(Clientsend cc);

	public Page findClientsendByUid(BasePageVO pv, Integer uid);

	public Page findAllClientsend(BasePageVO pv);
}
