package org.jsp.jpademo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id to print details");
		int id = sc.nextInt();
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		Employee e = m.find(Employee.class,id);
		if(e!=null)
		{
			System.out.println("ID : "+e.getId());
			System.out.println("Name : "+e.getName());
			System.out.println("Department : "+e.getDept());
			System.out.println("Designation : "+e.getDesg());
			System.out.println("Salary : "+e.getSalary());
		}
		else
		{
			System.out.println("Invalid ID");
		}
		sc.close();
	}
}
