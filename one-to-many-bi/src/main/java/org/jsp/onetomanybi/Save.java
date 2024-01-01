package org.jsp.onetomanybi;

import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		Department d = new Department();
		d.setName("Development");
		d.setLoc("Electronic City");
		
		Department d2 = new Department();
		d2.setName("Tester");
		d2.setLoc("NCR");
		
		Employee e1 = new Employee();
		e1.setDesg("Associate Software Engineer");
		e1.setName("Raj");
		e1.setSal(35000);
		e1.setDept(d);
		
		Employee e2 = new Employee();
		e2.setDesg("Developer");
		e2.setName("Rawnak");
		e2.setSal(45000);
		e2.setDept(d);
		
		Employee e3 = new Employee();
		e3.setDesg("Manager");
		e3.setName("Sam");
		e3.setSal(55000);
		e3.setDept(d);
		
		Employee e4 = new Employee();
		e4.setDesg("Software Engineer");
		e4.setName("Avinash");
		e4.setSal(32000);
		e4.setDept(d2);
		
		Employee e5 = new Employee();
		e5.setDesg("Tester");
		e5.setName("Gautam");
		e5.setSal(55000);
		e5.setDept(d2);
		
		Employee e6 = new Employee();
		e6.setDesg("Manager");
		e6.setName("Ali");
		e6.setSal(75000);
		e6.setDept(d2);
		
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));
		
		d2.setEmps(new ArrayList<Employee>(Arrays.asList(e4,e5,e6)));
		
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(d);
		m.persist(d2);
		t.begin();
		t.commit();
	}
}
