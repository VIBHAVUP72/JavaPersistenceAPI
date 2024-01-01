package org.jsp.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		Employee e = new Employee();
		e.setName("Nimkesh");
		e.setDesg("HR");
		m.persist(e);
		t.begin();
		t.commit();
	}
}
