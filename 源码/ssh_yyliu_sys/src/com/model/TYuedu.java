package com.model;

/**
 * TYuedu entity. @author MyEclipse Persistence Tools
 */

public class TYuedu implements java.io.Serializable
{

	// Fields

	private Integer id;
	private String biaoti;
	private String neirong;
	private String shijian;

	// Constructors

	/** default constructor */
	public TYuedu()
	{
	}

	/** full constructor */
	public TYuedu(String biaoti, String neirong, String shijian)
	{
		this.biaoti = biaoti;
		this.neirong = neirong;
		this.shijian = shijian;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getBiaoti()
	{
		return this.biaoti;
	}

	public void setBiaoti(String biaoti)
	{
		this.biaoti = biaoti;
	}

	public String getNeirong()
	{
		return this.neirong;
	}

	public void setNeirong(String neirong)
	{
		this.neirong = neirong;
	}

	public String getShijian()
	{
		return this.shijian;
	}

	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}

}