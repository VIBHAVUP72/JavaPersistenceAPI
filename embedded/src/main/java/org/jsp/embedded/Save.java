package org.jsp.embedded;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		PersonId id = new PersonId();
		id.setEmail("sonironak284@gmail.com");
		id.setPhone(8967563428l);
		
		Person p = new Person();
		p.setName("RAWNAK");
		p.setPassword("rs1234");
		p.setId(id);
		m.persist(p);
		t.begin();
		t.commit();
	}
}
