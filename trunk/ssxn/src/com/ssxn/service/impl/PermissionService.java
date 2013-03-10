package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IPermissionDAO;
import com.ssxn.dao.IRuleDAO;
import com.ssxn.model.Permission;
import com.ssxn.service.IPermissionService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class PermissionService implements IPermissionService {

	@Resource
	private IPermissionDAO permissionDAO;
	@Resource
	private IRuleDAO ruleDAO;

	@Override
	public void delPermission(Integer pid) {
		permissionDAO.delete(pid);
	}

	@Override
	public Permission getPermissionById(Integer pid) {
		return permissionDAO.get(pid);
	}

	@Override
	public void savePermission(Permission pm) {
		permissionDAO.save(pm);
	}

	@Override
	public Page findPermissionByIid(BaseVO bv, Integer iid) {
		return ruleDAO.findPage(bv, "from " + ruleDAO.getTableName() + " where iid=?", iid);
	}

	@Override
	public Page findAllPermission(BaseVO bv) {
		return permissionDAO.findAll(bv);
	}

	public IPermissionDAO getPermissionDAO() {
		return permissionDAO;
	}

	public void setPermissionDAO(IPermissionDAO permissionDAO) {
		this.permissionDAO = permissionDAO;
	}

	public IRuleDAO getRuleDAO() {
		return ruleDAO;
	}

	public void setRuleDAO(IRuleDAO ruleDAO) {
		this.ruleDAO = ruleDAO;
	}

}