package org.jsp.jpademo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOrSave 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ID to Update");
		int id = sc.nextInt();
		System.out.println("Enter Department, Designation, Name and Salary");
		String dept = sc.next();
		String desg = sc.next();
		String name = sc.next();
		double salary = sc.nextDouble();
		Employee e = new Employee();
		e.setId(id);
		e.setDesg(desg);
		e.setDept(dept);
		e.setName(name);
		e.setSalary(salary);
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		EntityTransaction t = m.getTransaction();
		m.merge(e);
		t.begin();
		t.commit();
		sc.close();
	}
}
