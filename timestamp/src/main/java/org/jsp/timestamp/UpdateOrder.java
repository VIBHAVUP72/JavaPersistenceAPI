package org.jsp.timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOrder
{
	public static void main(String[] args) 
	{
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		FoodOrder fo = m.find(FoodOrder.class, 1);
		fo.setItem("Momos");
		t.begin();
		t.commit();
	}
}
