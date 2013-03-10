package com.ssxn.service;

import com.ssxn.model.Member;
import com.ssxn.support.BaseVO;
import com.ssxn.vo.Page;

public interface IMemberService {
	public Member getMemberById(Integer mid);
	
	public void saveMember(Member mem);

	public Page findMemberByUid(BaseVO bv,Integer uid);
}