package com.ssxn.service;

import com.ssxn.model.Clientshoot;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IClientshootService {
	public Clientshoot getClientshootById(Integer cid);

	public void saveClientshoot(Clientshoot cc);

	public Page findClientshootByUid(BasePageVO pv, Integer uid);

	public Page findAllClientshoot(BasePageVO pv);
}