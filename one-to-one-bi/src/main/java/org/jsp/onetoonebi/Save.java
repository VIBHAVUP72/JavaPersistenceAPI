package org.jsp.onetoonebi;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) 
	{
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		
		Person p = new Person();
		p.setName("Rawnak");
		p.setAge(22);
		p.setPhone(8107664092l);
		
		PanCard card = new PanCard();
		card.setNumber("MBKPS3312");
		card.setDob(LocalDate.parse("2000-12-01"));
		card.setPincode(560076);
		
		p.setCard(card);
		
		card.setP(p);
		
		m.persist(p);
		t.begin();
		t.commit();
	}
}
