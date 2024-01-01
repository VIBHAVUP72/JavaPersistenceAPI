package org.jsp.manytooneuni;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Ans;
	private String AnsBy;
	@ManyToOne(cascade = CascadeType.ALL)
	private Question question;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getAns() 
	{
		return Ans;
	}
	public void setAns(String ans) 
	{
		Ans = ans;
	}
	public String getAnsBy()
	{
		return AnsBy;
	}
	public void setAnsBy(String ansBy) 
	{
		AnsBy = ansBy;
	}
	public Question getQuestion() 
	{
		return question;
	}
	public void setQuestion(Question question) 
	{
		this.question = question;
	}
}
