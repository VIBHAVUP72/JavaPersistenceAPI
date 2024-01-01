package org.jsp.manytooneuni;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		Question q = new Question();
		Answer a1 = new Answer();
		Answer a2 = new Answer();
		Answer a3 = new Answer();
		q.setQues("What is JAVA ?");
		q.setQuesBy("Nagabhishek");
		a1.setAns("JAVA is Multi- Threaded");
		a1.setAnsBy("Rawnak");
		a2.setAns("JAVA is Platform Independent");
		a2.setAnsBy("Vibhav");
		a3.setAns("JAVA is Required for a JOB");
		a3.setAnsBy("Akash");
		a1.setQuestion(q);
		a2.setQuestion(q);
		a3.setQuestion(q);
		
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(a1);
		m.persist(a2);
		m.persist(a3);
		t.begin();
		t.commit();
	}
}
