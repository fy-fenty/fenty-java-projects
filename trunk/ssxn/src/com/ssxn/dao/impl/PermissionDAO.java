package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IPermissionDAO;
import com.ssxn.model.Permission;
import com.ssxn.support.BaseDAO;
@Component
public class PermissionDAO extends BaseDAO<Permission, Integer> implements IPermissionDAO {
}
