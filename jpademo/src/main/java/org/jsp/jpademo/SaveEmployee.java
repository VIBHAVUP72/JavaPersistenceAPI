package org.jsp.jpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Details : ");
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter Name :");
		String name = sc.next();
		System.out.println("Enter Department :");
		String dept = sc.next();
		System.out.println("Enter Designation :");
		String desg = sc.next();
		System.out.println("Enter Salary :");
		int sal = sc.nextInt();
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setDesg(desg);
		e.setSalary(sal);
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.persist(e);
		t.begin();
		t.commit();
		sc.close();
	}
}
