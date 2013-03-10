package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IRuleDAO;
import com.ssxn.model.Rule;
import com.ssxn.service.IRuleService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class RuleService implements IRuleService {

	@Resource
	private IRuleDAO ruleDAO;

	@Override
	public Rule getRuleById(Integer rid) {
		return ruleDAO.get(rid);
	}

	@Override
	public void saveRule(Rule ru) {
		ruleDAO.save(ru);
	}

	@Override
	public void delRule(Integer rid) {
		ruleDAO.delete(rid);
	}

	@Override
	public Page findAllRule(BaseVO bv) {
		return ruleDAO.findAll(bv);
	}

	public IRuleDAO getRuleDAO() {
		return ruleDAO;
	}

	public void setRuleDAO(IRuleDAO ruleDAO) {
		this.ruleDAO = ruleDAO;
	}

}