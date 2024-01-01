package org.jsp.manytomanyuni;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Batch 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sub;
	private String code;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> std;
	public int getId() {
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getSub()
	{
		return sub;
	}
	public void setSub(String sub) 
	{
		this.sub = sub;
	}
	public String getCode() 
	{
		return code;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}
	public List<Student> getStd() 
	{
		return std;
	}
	public void setStd(List<Student> std) 
	{
		this.std = std;
	}
}
