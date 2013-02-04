package org.fengyao.action;

public class LoginAction {
	private String id;

	public String execute() {
		return "success";
	}

	public String check() {
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
