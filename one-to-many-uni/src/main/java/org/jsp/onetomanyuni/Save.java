package org.jsp.onetomanyuni;

import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		Hospital h = new Hospital();
		h.setName("APOLLO");
		h.setGst("APOLLO39765");
		h.setFounder("Reddy");
		
		Branch b1= new Branch();
		b1.setName("APOLLO Bangalore");
		b1.setEmail("abg@gmail.com");
		b1.setPhone(9876538563l);
		
		Branch b2= new Branch();
		b2.setName("APOLLO Mangalore");
		b2.setEmail("amg@gmail.com");
		b2.setPhone(9876946748l);
		
		Branch b3= new Branch();
		b3.setName("APOLLO Mysore");
		b3.setEmail("am@gmail.com");
		b3.setPhone(9876574983l);
		
		h.setBranches(new ArrayList<Branch>(Arrays.asList(b1,b2,b3)));
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(h);
		t.begin();
		t.commit();
	}
}
