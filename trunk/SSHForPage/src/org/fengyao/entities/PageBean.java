package org.fengyao.entities;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;

public class PageBean {
	private List list;
	private int currentPage;
	private int nextPage;
	private int prevPage;
	private int totalPage;
	private int totalResults;

	public PageBean() {
		super();
	}

	public PageBean(int start, int limit, Session session) {
		super();
		this.setCurrentPage(start / limit);
		this.setNextPage(this.getCurrentPage() + 1);
		this.setPrevPage(this.getCurrentPage() - 1);
		String sqlForTotal = "select count(mid) c from muser";
		Integer a = (Integer) session.createSQLQuery(sqlForTotal).addScalar("c", Hibernate.INTEGER).uniqueResult();
		int b = a / limit;
		if ((double) a / (double) limit != b) {
			b++;
		}
		this.setTotalPage(b);
		String sqlForPage = "select * from (select rownum r,t.* from (select * from muser) t where rownum <=?) tt where tt.r>?";
		this.setList(session.createSQLQuery(sqlForPage).addEntity(Muser.class).setInteger(0, start + limit)
				.setInteger(1, start).list());
		this.setTotalResults(list.size());
	}

	public List getList() {
		return list;
	}

	private void setList(List list) {
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	private void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNextPage() {
		if (nextPage >= totalPage) {
			return totalPage-1;
		}
		return nextPage;
	}

	private void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPrevPage() {
		if (prevPage < 0) {
			return 0;
		}
		return prevPage;
	}

	private void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	private void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getTotalResults() {
		return totalResults;
	}

	private void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
}