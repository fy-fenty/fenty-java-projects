package com.ssxn.support;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.util.Assert;

import com.ssxn.vo.Page;

@SuppressWarnings("unchecked")
public class BaseDAO<T, PK extends Serializable> extends SimpleDAO<T, PK> implements IBaseDAO<T, PK> {
	/**
	 * Log4j日志输出
	 */
	protected Logger logger = Logger.getLogger(getClass());

	public Query setPageParameter(final Query query, final int fisrt, final int limit) {
		// hibernate的firstResult的序号从0开始
		query.setFirstResult(fisrt);
		query.setMaxResults(limit);
		return query;
	}

	public long countHqlResult(final String hql, final Object... values) {
		String fromHql = hql;
		// select子句与order by子句会影响count查询,进行简单的排除.
		fromHql = "from " + StringUtils.substringAfter(fromHql, "from");
		fromHql = StringUtils.substringBefore(fromHql, "order by");

		String countHql = "select count(*) " + fromHql;

		Long count = 0L;
		try {
			count = findUnique(countHql, values);
		} catch (Exception e) {
			throw new RuntimeException("hql can't be auto count, hql is:" + countHql, e);
		}
		return count;
	}

	public long countSqlResult(final String sql, final Object... values) {
		/*
		 * String fromSql = sql; //select子句与order by子句会影响count查询,进行简单的排除.
		 * fromSql = "from " + StringUtils.substringAfter(fromSql, "from");
		 * fromSql = StringUtils.substringBefore(fromSql, "order by");
		 * 
		 * String countSql = "select count(*) " + fromSql;
		 */

		String countSql = "select count(1) from (" + sql + ")";

		Long count = 0L;
		try {
			count = ((Number) createSQLQuery(countSql, values).uniqueResult()).longValue();
		} catch (Exception e) {
			throw new RuntimeException("sql can't be auto count, hql is:" + countSql, e);
		}
		return count;
	}

	public long countSqlResult(final String sql, final Map<String, Object> values) {
		/*
		 * String fromSql = sql; //select子句与order by子句会影响count查询,进行简单的排除.
		 * fromSql = "from " + StringUtils.substringAfter(fromSql, "from");
		 * fromSql = StringUtils.substringBefore(fromSql, "order by");
		 * 
		 * String countSql = "select count(*) " + fromSql;
		 */

		String countSql = "select count(1) from (" + sql + ")";

		Long count = 0L;
		try {
			count = ((Number) createSQLQuery(countSql, values).uniqueResult()).longValue();
		} catch (Exception e) {
			throw new RuntimeException("sql can't be auto count, hql is:" + countSql, e);
		}
		return count;
	}

	public Page findPage(final BaseVO vo, final String hql, final Object... values) {
		Assert.notNull(vo, "vo不能为空");
		Page page = new Page();
		// count查询
		long totalCount = countHqlResult(hql, values);
		page.setTotalCount(totalCount);
		if (totalCount > 0) {
			// 按分页查询结果集
			Query query = createQuery(hql, values);
			setPageParameter(query, vo.getStart(), vo.getLimit());
			List result = query.list();
			page.setResult(result);
		}
		return page;
	}

	public Page findPage(final BaseVO vo, final String hql, final Map<String, Object> values) {
		Assert.notNull(vo, "page不能为空");
		Page page = new Page();
		// count查询
		long totalCount = countHqlResult(hql, values);
		page.setTotalCount(totalCount);

		if (totalCount > 0) {
			// 按分页查询结果集
			Query query = createQuery(hql, values);
			setPageParameter(query, vo.getStart(), vo.getLimit());
			List result = query.list();
			page.setResult(result);
		}
		return page;
	}

	public Page findPageBySQL(BaseVO vo, String sql, Map<String, Object> values) {
		Assert.notNull(vo, "page不能为空");

		Page page = new Page();
		// count查询
		long totalCount = countSqlResult(sql, values);
		page.setTotalCount(totalCount);

		if (totalCount > 0) {
			// 按分页查询结果集
			SQLQuery query = createSQLQuery(sql, values);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			setPageParameter(query, vo.getStart(), vo.getLimit());
			List result = query.list();
			page.setResult(result);
		}

		return page;
	}

	public Page findPageBySQL(BaseVO vo, String sql, Object... values) {
		Assert.notNull(vo, "page不能为空");

		Page page = new Page();
		// count查询
		long totalCount = countSqlResult(sql, values);
		page.setTotalCount(totalCount);

		if (totalCount > 0) {
			// 按分页查询结果集
			SQLQuery query = createSQLQuery(sql, values);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			setPageParameter(query, vo.getStart(), vo.getLimit());
			List result = query.list();
			page.setResult(result);
		}

		return page;
	}

	public Map<String, Object> findUniqueBySQL(String sql, Map<String, Object> values) {
		SQLQuery query = createSQLQuery(sql, values);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return (Map<String, Object>) query.uniqueResult();
	}

	public Map<String, Object> findUniqueBySQL(String sql, Object... values) {
		SQLQuery query = createSQLQuery(sql, values);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return (Map<String, Object>) query.uniqueResult();
	}

	public Page findAll(BaseVO bv) {
		return this.findPage(bv, "from " + this.getTableName());
	}

}