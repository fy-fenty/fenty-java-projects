package org.fengyao.web.actions;

import org.fengyao.entities.Muser;
import org.fengyao.services.IMuserService;
import org.fengyao.vos.LoginVo;

public class MuserAction {
	private IMuserService muserService;
	private LoginVo loginVo;

	public String login() {
//		Muser muser = muserService.login(loginVo.getMuname(), loginVo.getMupwd());
//		if (muser == null) {
//		} else {
//		}
		System.out.println("ok");
		return "ok";
	}

	public IMuserService getMuserService() {
		return muserService;
	}

	public void setMuserService(IMuserService muserService) {
		this.muserService = muserService;
	}

	public LoginVo getLoginVo() {
		return loginVo;
	}

	public void setLoginVo(LoginVo loginVo) {
		this.loginVo = loginVo;
	}
}