package com.ssxn.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.ssxn.service.impl.ClientlookService;
import com.ssxn.support.BasePageVO;
import com.ssxn.util.Struts2Utils;

public class LookAction {
	@Resource
	private ClientlookService clientlookService;
	private BasePageVO pv = new BasePageVO();

	public String findAll() throws IOException {
		boolean status = true;
		Object msg;
		msg = clientlookService.findAllClientlook(pv);
		Struts2Utils.renderHtml(status, msg);
		return null;
	}

	public ClientlookService getClientlookService() {
		return clientlookService;
	}

	public void setClientlookService(ClientlookService clientlookService) {
		this.clientlookService = clientlookService;
	}

	public BasePageVO getPv() {
		return pv;
	}

	public void setPv(BasePageVO pv) {
		this.pv = pv;
	}

}
