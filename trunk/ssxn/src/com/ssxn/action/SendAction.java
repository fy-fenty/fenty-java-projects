package com.ssxn.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.ssxn.service.impl.ClientsendService;
import com.ssxn.support.BasePageVO;
import com.ssxn.util.Struts2Utils;

public class SendAction {
	@Resource
	private ClientsendService clientsendService;
	private BasePageVO pv = new BasePageVO();

	public String findAll() throws IOException {
		boolean status = true;
		Object msg;
		msg = clientsendService.findAllClientsend(pv);
		Struts2Utils.renderHtml(status, msg);
		return null;
	}

	public ClientsendService getClientsendService() {
		return clientsendService;
	}

	public void setClientsendService(ClientsendService clientsendService) {
		this.clientsendService = clientsendService;
	}

	public BasePageVO getPv() {
		return pv;
	}

	public void setPv(BasePageVO pv) {
		this.pv = pv;
	}
}