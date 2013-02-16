package com.ssxn.service;

import com.ssxn.model.Permission;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IPermissionService {
	public Permission getPermissionById(Integer pid);

	public void savePermission(Permission pm);

	public void delPermission(Integer pid);

	public Page findPermissionByIid(BaseVO bv, Integer iid);

	public Page findAllPermission(BaseVO bv);
}