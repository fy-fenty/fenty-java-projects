package com.ssxn.dao.impl;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMemberDAO;
import com.ssxn.model.Member;
import com.ssxn.support.BaseDAO;
@Component
public class MemberDAO extends BaseDAO<Member, Integer> implements IMemberDAO {
}
