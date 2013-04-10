package com.ssxn.service;

import com.ssxn.model.Clientchoose;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IClientchooseService {
	public Clientchoose getClientchooseById(Integer cid);

	public void saveClientchoose(Clientchoose cc);

	public Page findClientchooseByUid(BasePageVO pv, Integer uid);

	public Page findAllClientchoose(BasePageVO pv);
}