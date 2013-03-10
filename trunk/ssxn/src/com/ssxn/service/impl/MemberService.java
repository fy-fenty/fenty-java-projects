package com.ssxn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ssxn.dao.IMemberDAO;
import com.ssxn.model.Member;
import com.ssxn.service.IMemberService;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

@Component
public class MemberService implements IMemberService {

	@Resource
	private IMemberDAO memberDAO;

	@Override
	public Member getMemberById(Integer mid) {
		return memberDAO.get(mid);
	}

	@Override
	public void saveMember(Member mem) {
		memberDAO.save(mem);
	}

	@Override
	public Page findMemberByUid(BaseVO bv, Integer uid) {
		return memberDAO.findPage(bv, "from " + memberDAO.getTableName());
	}

	public IMemberDAO getMemberDAO() {
		return memberDAO;
	}

	public void setMemberDAO(IMemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

}