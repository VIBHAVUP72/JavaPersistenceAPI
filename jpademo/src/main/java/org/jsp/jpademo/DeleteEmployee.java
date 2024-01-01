package org.jsp.jpademo;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id to Delete Record");
		int id = sc.nextInt();
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		Employee e = m.find(Employee.class,id);
		if(e!=null)
		{
			m.remove(e);
			EntityTransaction t = m.getTransaction();
			t.begin();
			t.commit();
			System.out.println("Record has been Deleted");
		}
		else
		{
			System.out.println("Invalid ID");
		}
		sc.close();
	}
}
