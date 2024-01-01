package org.jsp.manytomanyuni;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory m  = Persistence.createEntityManagerFactory("dev");
		System.out.println(m);
	}
}
