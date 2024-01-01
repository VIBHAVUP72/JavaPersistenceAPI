package org.jsp.onetomanybi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String desg;
	private double sal;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dept_id", nullable = false)
	private Department dept;
	
	public String getDesg()
	{
		return desg;
	}
	public void setDesg(String desg) 
	{
		this.desg = desg;
	}
	public double getSal() 
	{
		return sal;
	}
	public void setSal(double sal) 
	{
		this.sal = sal;
	}
	public Department getDept()
	{
		return dept;
	}
	public void setDept(Department dept) 
	{
		this.dept = dept;
	}
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
}
