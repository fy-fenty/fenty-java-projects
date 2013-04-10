package com.ssxn.service;

import com.ssxn.model.Permission;
import com.ssxn.support.BasePageVO;
import com.ssxn.vo.Page;

public interface IPermissionService {
	public Permission getPermissionById(Integer pid);

	public void savePermission(Permission pm);

	public void delPermission(Integer pid);

	public Page findPermissionByIid(BasePageVO bv, Integer iid);

	public Page findAllPermission(BasePageVO bv);
}