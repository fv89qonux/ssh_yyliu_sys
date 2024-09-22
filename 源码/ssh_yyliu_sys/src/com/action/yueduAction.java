package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.dao.TYueduDAO;
import com.model.TUser;
import com.model.TYuedu;
import com.opensymphony.xwork2.ActionSupport;

public class yueduAction extends ActionSupport
{
	private Integer id;
	private String biaoti;
	private String neirong;
	private String shijian;
	
	private TYueduDAO yueduDAO;
	
	
	public String yueduAdd()
	{
		TYuedu yuedu=new TYuedu();
		
		yuedu.setBiaoti(biaoti);
		yuedu.setNeirong(neirong);
		yuedu.setShijian(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date()));
		
		yueduDAO.save(yuedu);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "信息添加成功");
		return "msg";
	}
	
	public String yueduMana()
	{
		String sql="from TYuedu";
		List yueduList=yueduDAO.getHibernateTemplate().find(sql);

		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yueduList", yueduList);
		return ActionSupport.SUCCESS;
	}
	
	public String yueduDel()
	{
		
		TYuedu yuedu=yueduDAO.findById(id);
		yueduDAO.delete(yuedu);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "信息删除成功");
		return "msg";
	}

	
	public String yueduAll()
	{
		String sql="from TYuedu";
		List yueduList=yueduDAO.getHibernateTemplate().find(sql);

		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yueduList", yueduList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String yueduDetailQian()
	{
		
		TYuedu yuedu=yueduDAO.findById(id);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("yuedu", yuedu);
		return ActionSupport.SUCCESS;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getBiaoti()
	{
		return biaoti;
	}

	public void setBiaoti(String biaoti)
	{
		this.biaoti = biaoti;
	}

	public String getNeirong()
	{
		return neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getShijian()
	{
		return shijian;
	}

	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}

	public TYueduDAO getYueduDAO()
	{
		return yueduDAO;
	}

	public void setYueduDAO(TYueduDAO yueduDAO)
	{
		this.yueduDAO = yueduDAO;
	}
	
}
