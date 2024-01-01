package org.jsp.assignments;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jsp.manytomanybi.Batch;
import org.jsp.manytomanybi.Student;

public class FetchBatchesByStdId 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Student ID to Find the Batches");
		int sid = sc.nextInt();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Student s = m.find(Student.class, sid);
		if(s!=null) 
		{
			List<Batch> batches = s.getBatches();
			for(Batch b : batches)
			{
				System.out.println("ID  : "+b.getId());
				System.out.println("Code : "+b.getCode());
				System.out.println("Subject : "+b.getSubject());
				System.out.println("-----------------------");
			}	
		}
		else
		{
			System.out.println("Invalid ID");
		}
		sc.close();
	}
}

