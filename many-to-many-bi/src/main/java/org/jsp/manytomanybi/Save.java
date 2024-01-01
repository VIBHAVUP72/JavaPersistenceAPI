package org.jsp.manytomanybi;

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
		b1.setSubject("JAVA");
		b1.setCode("DJDJ66");
		
		Batch b2 = new Batch();
		b2.setSubject("HIBERNATE");
		b2.setCode("TDTD88");
		
		Batch b3 = new Batch();
		b3.setSubject("WORKSHOP");
		b3.setCode("NXHYD88");
		
		Student s1 = new Student();
		s1.setName("Amkash");
		s1.setPhone(8383838382l);
		s1.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		Student s2 = new Student();
		s2.setName("Vimbhav");
		s2.setPhone(5373893933l);
		s2.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
	
		Student s3 = new Student();
		s3.setName("Dogesh");
		s3.setPhone(12345678902l);
		s3.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(b1);
		m.persist(b2);
		m.persist(b3);
		t.begin();
		t.commit();
	}
}
