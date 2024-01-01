package org.jsp.timestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String item;
	private double cost;
	@CreationTimestamp
	private LocalDateTime orderedTime;
	@UpdateTimestamp
	private LocalDateTime delTime;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getItem() 
	{
		return item;
	}
	public void setItem(String item) 
	{
		this.item = item;
	}
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost) 
	{
		this.cost = cost;
	}
	public LocalDateTime getOrderedTime() {
		return orderedTime;
	}
	public void setOrderedTime(LocalDateTime orderedTime) {
		this.orderedTime = orderedTime;
	}
	public LocalDateTime getDelTime() {
		return delTime;
	}
	public void setDelTime(LocalDateTime delTime) {
		this.delTime = delTime;
	}

}
