package com.ssxn.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.ssxn.service.impl.ClientshootService;
import com.ssxn.support.BasePageVO;
import com.ssxn.util.Struts2Utils;

public class ShootAction {
	@Resource
	private ClientshootService clientshootService;
	private BasePageVO pv = new BasePageVO();

	public String findAll() throws IOException{
		boolean status = true;
		Object msg;
		msg = clientshootService.findAllClientshoot(pv);
		Struts2Utils.renderHtml(status, msg);
		return null;
	}
	
	public ClientshootService getClientshootService() {
		return clientshootService;
	}

	public void setClientshootService(ClientshootService clientshootService) {
		this.clientshootService = clientshootService;
	}

	public BasePageVO getPv() {
		return pv;
	}

	public void setPv(BasePageVO pv) {
		this.pv = pv;
	}

}
