package org.jsp.hiblifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee 
{
	public static void main(String[] args)
	{
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		Employee e = new Employee();
		m.remove(e);
		t.begin();
		t.commit();
	}
}
