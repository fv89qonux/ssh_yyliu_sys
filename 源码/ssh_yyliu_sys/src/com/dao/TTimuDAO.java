package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TTimu;

/**
 * Data access object (DAO) for domain model class TTimu.
 * 
 * @see com.model.TTimu
 * @author MyEclipse Persistence Tools
 */

public class TTimuDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TTimuDAO.class);

	// property constants
	public static final String NAME = "name";

	public static final String XUANXIANGA = "xuanxianga";

	public static final String XUANXIANGB = "xuanxiangb";

	public static final String XUANXIANGC = "xuanxiangc";

	public static final String XUANXIANGD = "xuanxiangd";

	public static final String DAAN = "daan";

	public static final String FENSHU = "fenshu";

	public static final String DEL = "del";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TTimu transientInstance)
	{
		log.debug("saving TTimu instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TTimu persistentInstance)
	{
		log.debug("deleting TTimu instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TTimu findById(java.lang.Integer id)
	{
		log.debug("getting TTimu instance with id: " + id);
		try
		{
			TTimu instance = (TTimu) getHibernateTemplate().get(
					"com.model.TTimu", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TTimu instance)
	{
		log.debug("finding TTimu instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TTimu instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TTimu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name)
	{
		return findByProperty(NAME, name);
	}

	public List findByXuanxianga(Object xuanxianga)
	{
		return findByProperty(XUANXIANGA, xuanxianga);
	}

	public List findByXuanxiangb(Object xuanxiangb)
	{
		return findByProperty(XUANXIANGB, xuanxiangb);
	}

	public List findByXuanxiangc(Object xuanxiangc)
	{
		return findByProperty(XUANXIANGC, xuanxiangc);
	}

	public List findByXuanxiangd(Object xuanxiangd)
	{
		return findByProperty(XUANXIANGD, xuanxiangd);
	}

	public List findByDaan(Object daan)
	{
		return findByProperty(DAAN, daan);
	}

	public List findByFenshu(Object fenshu)
	{
		return findByProperty(FENSHU, fenshu);
	}

	public List findByDel(Object del)
	{
		return findByProperty(DEL, del);
	}

	public List findAll()
	{
		log.debug("finding all TTimu instances");
		try
		{
			String queryString = "from TTimu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TTimu merge(TTimu detachedInstance)
	{
		log.debug("merging TTimu instance");
		try
		{
			TTimu result = (TTimu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TTimu instance)
	{
		log.debug("attaching dirty TTimu instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TTimu instance)
	{
		log.debug("attaching clean TTimu instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TTimuDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TTimuDAO) ctx.getBean("TTimuDAO");
	}
}