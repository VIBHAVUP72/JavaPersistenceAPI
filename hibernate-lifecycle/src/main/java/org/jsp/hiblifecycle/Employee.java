package org.jsp.hiblifecycle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private  String name;
	private String desg;
	private long phone;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesg() 
	{
		return desg;
	}
	public void setDesg(String desg) 
	{
		this.desg = desg;
	}
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
}
