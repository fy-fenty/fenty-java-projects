package com.ssxn.action;

import java.io.IOException;

import javax.annotation.Resource;

import com.ssxn.service.impl.MorderService;
import com.ssxn.support.BasePageVO;
import com.ssxn.util.Struts2Utils;

public class OrderAction {
	@Resource
	private MorderService morderService;
	private BasePageVO pv = new BasePageVO();

	public String findAll() throws IOException {
		boolean status = true;
		Object msg;
		msg = morderService.findAllMorder(pv);
		Struts2Utils.renderHtml(status, msg);
		return null;
	}

	public MorderService getMorderService() {
		return morderService;
	}

	public void setMorderService(MorderService morderService) {
		this.morderService = morderService;
	}

}