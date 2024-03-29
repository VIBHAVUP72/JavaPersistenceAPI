package org.jsp.manytomanybi;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long phone;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
	private List<Batch> batches;
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
	public long getPhone() 
	{
		return phone;
	}
	public void setPhone(long phone) 
	{
		this.phone = phone;
	}
	public List<Batch> getBatches() 
	{
		return batches;
	}
	public void setBatches(List<Batch> batches)
	{
		this.batches = batches;
	}
}
