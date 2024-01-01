package org.jsp.jpademo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name, desg, dept;
	private double salary;
	
	public int getId() 
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() 
	{
		return dept;
	}
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
}
