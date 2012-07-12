package org.fengyao.daos;

import java.util.List;

import org.fengyao.entities.Vote;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;

@SuppressWarnings("rawtypes")
public class VoteDao extends BaseDao<Vote> {

	public List getVoteTable() {
		String sql = "select v.vtitle,v.vcontent,(select count(*) from vote_detail vd where vd.vid = v.vid) from vote v";
		SQLQuery sqlQuery = super.getSession().createSQLQuery(sql);
		sqlQuery.setResultTransformer(Transformers.TO_LIST);
		return sqlQuery.list();
	}
}