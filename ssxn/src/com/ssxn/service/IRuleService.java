package com.ssxn.service;

import com.ssxn.model.Rule;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IRuleService {
	public Rule getRuleById(Integer rid);

	public void saveRule(Rule ru);

	public void delRule(Integer rid);

	public Page findAllRule(BaseVO bv);
}