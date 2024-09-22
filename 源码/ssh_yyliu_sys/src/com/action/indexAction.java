package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TCatelogDAO;
import com.dao.THuifuDAO;
import com.dao.TUserDAO;
import com.dao.TZhutiDAO;
import com.model.TCatelog;
import com.model.TZhuti;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class indexAction extends ActionSupport
{
	private TCatelogDAO catelogDAO;
	private TZhutiDAO zhutiDAO;
	private TUserDAO userDAO;
	
	public String index()
	{
		Map request=(Map)ServletActionContext.getContext().get("request");
		Map session=ActionContext.getContext().getSession();
		
		String sql="from TCatelog where del='no'";
		List cateLogList=catelogDAO.getHibernateTemplate().find(sql);
		for(int i=0;i<cateLogList.size();i++)
		{
			TCatelog catelog=(TCatelog)cateLogList.get(i);
			catelog.setUser(userDAO.findById(catelog.getBanzhu()));
			catelog.setZhutishu(get_zhutishu(catelog.getId()));
		}
		
		request.put("cateLogList", cateLogList);
		return ActionSupport.SUCCESS;
	}

	public int get_zhutishu(int catelogId)
	{
		String s2="from TZhuti where catelogId="+catelogId;
		List zhutiList=zhutiDAO.getHibernateTemplate().find(s2);
		return zhutiList.size();
	}

	public TCatelogDAO getCatelogDAO()
	{
		return catelogDAO;
	}


	public void setCatelogDAO(TCatelogDAO catelogDAO)
	{
		this.catelogDAO = catelogDAO;
	}


	public TZhutiDAO getZhutiDAO()
	{
		return zhutiDAO;
	}


	public TUserDAO getUserDAO()
	{
		return userDAO;
	}


	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}


	public void setZhutiDAO(TZhutiDAO zhutiDAO)
	{
		this.zhutiDAO = zhutiDAO;
	}

}
