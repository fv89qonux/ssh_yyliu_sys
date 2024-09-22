package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TCatelogDAO;
import com.dao.TUserDAO;
import com.model.TCatelog;
import com.model.TUser;
import com.opensymphony.xwork2.ActionSupport;

public class catelogAction extends ActionSupport
{
	private Integer id;
	private String name;
	private String jieshao;
	private int banzhu;
	private String del;
	
	private String message;
	private String path;
	
	private TCatelogDAO catelogDAO;
	private TUserDAO userDAO;
	
	
	public String catelogAdd()
	{
		TCatelog catelog=new TCatelog();
		
		catelog.setName(name);
		catelog.setJieshao(jieshao);
		catelog.setBanzhu(0);
		catelog.setDel("no");
		
		catelogDAO.save(catelog);
		
		this.setMessage("操作成功");
		this.setPath("catelogMana.action");
		return "succeed";
	}
	
	public String catelogMana()
	{
		String sql="from TCatelog where del='no'";
		List cateLogList=catelogDAO.getHibernateTemplate().find(sql);
		for(int i=0;i<cateLogList.size();i++)
		{
			TCatelog catelog=(TCatelog)cateLogList.get(i);
			catelog.setUser(userDAO.findById(catelog.getBanzhu()));
		}
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("cateLogList", cateLogList);
		return ActionSupport.SUCCESS;
	}
	
	public String catelogDel()
	{
		
		TCatelog catelog=catelogDAO.findById(id);
		catelog.setDel("yes");
		catelogDAO.attachDirty(catelog);
		
		this.setMessage("操作成功");
		this.setPath("catelogMana.action");
	    return "succeed";
	}
	
	
	public String banzhushezhi()
	{
		HttpServletRequest request=ServletActionContext.getRequest();
		String loginname=request.getParameter("loginname").trim();
		
		String sql="from TUser where loginname=? and del='no'";
		Object[] c={loginname.trim()};
		List list=userDAO.getHibernateTemplate().find(sql,c);
		if(list.size()==0)
		{
			request.setAttribute("msg", "你输入的账号不存在");
		    return "msg";
		}
		
		TUser user=(TUser)list.get(0);
		
		TCatelog catelog=catelogDAO.findById(id);
		catelog.setBanzhu(user.getId());
		catelogDAO.attachDirty(catelog);
		
		request.setAttribute("msg", "版主设置完毕");
	    return "msg";
	}
	

	public TCatelogDAO getCatelogDAO()
	{
		return catelogDAO;
	}
	public void setCatelogDAO(TCatelogDAO catelogDAO)
	{
		this.catelogDAO = catelogDAO;
	}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}

	public String getJieshao()
	{
		return jieshao;
	}

	public void setJieshao(String jieshao)
	{
		this.jieshao = jieshao;
	}

	public int getBanzhu()
	{
		return banzhu;
	}

	public TUserDAO getUserDAO()
	{
		return userDAO;
	}

	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	public void setBanzhu(int banzhu)
	{
		this.banzhu = banzhu;
	}

	public String getDel()
	{
		return del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
