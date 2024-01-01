package org.jsp.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindCache 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityManager m2 = f.createEntityManager();
		Employee e1 = m.find(Employee.class, 2);
		Employee e2 = m.find(Employee.class, 2);
		Employee e3 = m2.find(Employee.class, 3);
		Employee e4 = m.find(Employee.class, 2);
	}
}
