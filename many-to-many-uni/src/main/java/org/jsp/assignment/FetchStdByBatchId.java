package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jsp.manytomanyuni.Batch;
import org.jsp.manytomanyuni.Student;

public class FetchStdByBatchId 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Batch ID to Find the Students");
		int bid = sc.nextInt();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Batch b = m.find(Batch.class, bid);
		if(b!=null) 
		{
			List<Student> stds = b.getStd();
			for(Student s : stds)
			{
				System.out.println("ID : "+s.getId());
				System.out.println("Name : "+s.getName());
				System.out.println("Phone Number : "+s.getPhone());
				System.out.println("------------------");
			}	
		}
		else
		{
			System.out.println("Invalid ID");
		}
		sc.close();
	}
}

