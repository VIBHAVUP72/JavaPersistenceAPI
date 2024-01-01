package org.jsp.manytomanyuni;

import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args)
	{
		Batch b1 = new Batch();
		b1.setSub("Java");
		b1.setCode("SECA22");
		
		Batch b2 = new Batch();
		b2.setSub("WebTech");
		b2.setCode("SFCC22");
		
		Batch b3 = new Batch();
		b3.setSub("Hibernate");
		b3.setCode("SJPQL");
		
		Student s1 = new Student();
		s1.setName("Amkash");
		s1.setPhone(9876543210l);
		
		Student s2 = new Student();
		s2.setName("Jaamthu");
		s2.setPhone(678349399l);
		
		Student s3 = new Student();
		s3.setName("Vimbhav");
		s3.setPhone(5678321054l);
		
		b1.setStd(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b2.setStd(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b3.setStd(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(b1);
		m.persist(b2);
		m.persist(b3);
		t.begin();
		t.commit();	
	}
}
