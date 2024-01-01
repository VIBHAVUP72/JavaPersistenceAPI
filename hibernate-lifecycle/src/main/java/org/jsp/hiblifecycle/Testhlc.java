package org.jsp.hiblifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testhlc
{
	public static void main(String[] args)
	{
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		Employee e = new Employee();
		e.setName("Raj");
		e.setDesg("SDE");
		e.setPhone(9876543210l);
		m.persist(e);
		e.setName("Sam");
		e.setDesg("Associate");
		t.begin();
		t.commit();
		m.detach(e);
		e.setName("Dogesh");
		e.setDesg("Trainee");
	}
}
