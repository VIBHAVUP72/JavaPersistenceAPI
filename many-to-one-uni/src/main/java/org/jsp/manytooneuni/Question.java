package org.jsp.manytooneuni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Ques;
	private String QuesBy;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getQues() 
	{
		return Ques;
	}
	public void setQues(String ques) 
	{
		Ques = ques;
	}
	public String getQuesBy() 
	{
		return QuesBy;
	}
	public void setQuesBy(String quesBy) 
	{
		QuesBy = quesBy;
	}
}
