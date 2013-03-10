package com.ssxn.service;

import com.ssxn.model.Clientshoot;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IClientshootService {
	public Clientshoot getClientshootById(Integer cid);

	public void saveClientshoot(Clientshoot cc);

	public Page findClientshootByUid(BaseVO bv, Integer uid);
}