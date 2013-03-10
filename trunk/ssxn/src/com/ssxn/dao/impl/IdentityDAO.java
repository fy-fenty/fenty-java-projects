package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IIdentityDAO;
import com.ssxn.model.Identity;
import com.ssxn.support.BaseDAO;
@Component
public class IdentityDAO extends BaseDAO<Identity, Integer> implements IIdentityDAO {

}
