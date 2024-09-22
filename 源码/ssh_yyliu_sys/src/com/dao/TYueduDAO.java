package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TYuedu;

/**
 * A data access object (DAO) providing persistence and search support for
 * TYuedu entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.model.TYuedu
 * @author MyEclipse Persistence Tools
 */

public class TYueduDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TYueduDAO.class);
	// property constants
	public static final String BIAOTI = "biaoti";
	public static final String NEIRONG = "neirong";
	public static final String SHIJIAN = "shijian";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TYuedu transientInstance)
	{
		log.debug("saving TYuedu instance");
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

	public void delete(TYuedu persistentInstance)
	{
		log.debug("deleting TYuedu instance");
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

	public TYuedu findById(java.lang.Integer id)
	{
		log.debug("getting TYuedu instance with id: " + id);
		try
		{
			TYuedu instance = (TYuedu) getHibernateTemplate().get(
					"com.model.TYuedu", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TYuedu instance)
	{
		log.debug("finding TYuedu instance by example");
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
		log.debug("finding TYuedu instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TYuedu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBiaoti(Object biaoti)
	{
		return findByProperty(BIAOTI, biaoti);
	}

	public List findByNeirong(Object neirong)
	{
		return findByProperty(NEIRONG, neirong);
	}

	public List findByShijian(Object shijian)
	{
		return findByProperty(SHIJIAN, shijian);
	}

	public List findAll()
	{
		log.debug("finding all TYuedu instances");
		try
		{
			String queryString = "from TYuedu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TYuedu merge(TYuedu detachedInstance)
	{
		log.debug("merging TYuedu instance");
		try
		{
			TYuedu result = (TYuedu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TYuedu instance)
	{
		log.debug("attaching dirty TYuedu instance");
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

	public void attachClean(TYuedu instance)
	{
		log.debug("attaching clean TYuedu instance");
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

	public static TYueduDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TYueduDAO) ctx.getBean("TYueduDAO");
	}
}