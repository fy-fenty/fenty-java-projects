package com.ssxn.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.ssxn.service.impl.ClientchooseService;
import com.ssxn.support.BasePageVO;
import com.ssxn.util.Struts2Utils;

public class ChooseAction {
	@Resource
	private ClientchooseService clientchooseService;
	private BasePageVO pv = new BasePageVO();

	public String findAll() throws IOException {
		boolean status = true;
		Object msg;
		msg = clientchooseService.findAllClientchoose(pv);
		Struts2Utils.renderHtml(status, msg);
		return null;
	}

	public ClientchooseService getClientchooseService() {
		return clientchooseService;
	}

	public void setClientchooseService(ClientchooseService clientchooseService) {
		this.clientchooseService = clientchooseService;
	}

	public BasePageVO getPv() {
		return pv;
	}

	public void setPv(BasePageVO pv) {
		this.pv = pv;
	}
}