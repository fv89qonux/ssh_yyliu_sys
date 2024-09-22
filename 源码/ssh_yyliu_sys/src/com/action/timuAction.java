package com.action;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TTimuDAO;
import com.model.TTimu;
import com.opensymphony.xwork2.ActionSupport;

public class timuAction extends ActionSupport
{
	private int id;
	private String name;
	private String xuanxianga;
	private String xuanxiangb;
	private String xuanxiangc;
	private String xuanxiangd;
	private String daan;
	private int fenshu;
	 
	private String message;
	private String path;
	
	private TTimuDAO timuDAO;
	
	public String timuAdd()
	{
		TTimu timu=new TTimu();
		
		timu.setName(name);
		timu.setXuanxianga(xuanxianga);
		timu.setXuanxiangb(xuanxiangb);
		timu.setXuanxiangc(xuanxiangc);
		timu.setXuanxiangd(xuanxiangd);
		timu.setDaan(daan);
		timu.setFenshu(fenshu);
		timu.setDel("no");
		
		timuDAO.save(timu);
		this.setMessage("操作成功");
		this.setPath("timuMana.action");
		return "succeed";
	}
	
	public String timuDel()
	{
		TTimu timu=timuDAO.findById(id);
		timu.setDel("yes");
		timuDAO.attachDirty(timu);
		this.setMessage("删除成功");
		this.setPath("timuMana.action");
		return "succeed";
	}
	
	public String timuMana()
	{
		String sql="from TTimu where del='no'";
		List timuList=timuDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("timuList", timuList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String timuAll()
	{
		String sql="from TTimu where del='no'";
		List timuList=timuDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("timuList", timuList);
		return ActionSupport.SUCCESS;
	}
	
	
	public String ziciDafen()
	{
		/*HttpServletRequest request=ServletActionContext.getRequest();
		int fenshu=0;
		
		String timuIdList=request.getParameter("timuIdList");
		
		String[] timuIdList1=timuIdList.split(",");
		
		for(int i=0;i<timuIdList1.length;i++)
		{
			String timuId=timuIdList1[i];
			String timuDaan_user=request.getParameter(timuId);
			String timuDaan=timuDAO.findById(Integer.parseInt(timuId)).getDaan();
			if(timuDaan.equalsIgnoreCase(timuDaan_user))
			{
				fenshu+=timuDAO.findById(Integer.parseInt(timuId)).getFenshu();
			}
		}
		
		this.setMessage("本次测试得分："+fenshu);
		this.setPath("index.action");
		return "succeed";*/
		
		int fenshu=0;
		
		HttpServletRequest request=ServletActionContext.getRequest();
		Enumeration paraNames  =request.getParameterNames();
		
		ArrayList paraNameList = new ArrayList(); 
		while (paraNames.hasMoreElements()) 
		{ 
		     paraNameList.add(paraNames.nextElement()); 
		} 
		for (int i = 0; i < paraNameList.size(); i++) 
		{ 
			String httpParamName = (String) paraNameList.get(i); 
			System.out.println(httpParamName+"YYYY");
			
			String daan = request.getParameter(httpParamName);
			String daan1=timuDAO.findById(Integer.parseInt(httpParamName)).getDaan();
			if(daan.equalsIgnoreCase(daan1))
			{
				fenshu+=timuDAO.findById(Integer.parseInt(httpParamName)).getFenshu();
			}
		} 
		
		this.setMessage("score："+fenshu);
		this.setPath("index.action");
		return "succeed";
		
	}
	

	public String getDaan()
	{
		return daan;
	}

	public void setDaan(String daan)
	{
		this.daan = daan;
	}


	public int getFenshu()
	{
		return fenshu;
	}

	public void setFenshu(int fenshu)
	{
		this.fenshu = fenshu;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
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

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public TTimuDAO getTimuDAO()
	{
		return timuDAO;
	}

	public void setTimuDAO(TTimuDAO timuDAO)
	{
		this.timuDAO = timuDAO;
	}

	public String getXuanxianga()
	{
		return xuanxianga;
	}

	public void setXuanxianga(String xuanxianga)
	{
		this.xuanxianga = xuanxianga;
	}

	public String getXuanxiangb()
	{
		return xuanxiangb;
	}

	public void setXuanxiangb(String xuanxiangb)
	{
		this.xuanxiangb = xuanxiangb;
	}

	public String getXuanxiangc()
	{
		return xuanxiangc;
	}

	public void setXuanxiangc(String xuanxiangc)
	{
		this.xuanxiangc = xuanxiangc;
	}

	public String getXuanxiangd()
	{
		return xuanxiangd;
	}

	public void setXuanxiangd(String xuanxiangd)
	{
		this.xuanxiangd = xuanxiangd;
	}
	
}
