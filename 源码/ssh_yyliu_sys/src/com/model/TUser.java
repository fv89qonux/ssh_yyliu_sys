package com.model;

/**
 * TUser generated by MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable
{

	private Integer id;
	private String loginname;
	private String loginpw;
	private String name;

	private String sex;
	private String age;
	private String address;
	private String tel;

	private String email;
	private String fujian;
	private Integer jifen;
	private String del;
	
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAge()
	{
		return age;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
	public String getDel()
	{
		return del;
	}
	public void setDel(String del)
	{
		this.del = del;
	}
	public String getEmail()
	{
		return email;
	}
	
	public String getFujian()
	{
		return fujian;
	}
	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getLoginname()
	{
		return loginname;
	}
	public void setLoginname(String loginname)
	{
		this.loginname = loginname;
	}
	public String getLoginpw()
	{
		return loginpw;
	}
	
	public void setLoginpw(String loginpw)
	{
		this.loginpw = loginpw;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	public String getTel()
	{
		return tel;
	}
	public void setTel(String tel)
	{
		this.tel = tel;
	}
	public Integer getJifen()
	{
		return jifen;
	}
	public void setJifen(Integer jifen)
	{
		this.jifen = jifen;
	}

}