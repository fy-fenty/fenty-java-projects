package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IRuleDAO;
import com.ssxn.model.Rule;
import com.ssxn.support.BaseDAO;
@Component
public class RuleDAO extends BaseDAO<Rule, Integer> implements IRuleDAO {

}
