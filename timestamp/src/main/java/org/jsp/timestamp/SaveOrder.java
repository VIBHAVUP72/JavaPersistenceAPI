package org.jsp.timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrder 
{
	public static void main(String[] args) 
	{
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		FoodOrder fo = new FoodOrder();
		fo.setItem("Panner Tikka");
		fo.setCost(340);
		m.merge(fo);
		t.begin();
		t.commit();
	}
}
