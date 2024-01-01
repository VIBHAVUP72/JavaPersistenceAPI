package org.jsp.assignments;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.manytomanybi.Batch;

public class FetchBatchesByStdName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name to Fetch Batches");
		String sname = sc.next();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select s.batches from Student s where s.name=?1";
		Query q = m.createQuery(qry);
		q.setParameter(1, sname);
		List<Batch> batches = q.getResultList();
		if(batches.size()>0)
		{
			for(Batch b :batches)
			{
				System.out.println("ID  : "+b.getId());
				System.out.println("Code : "+b.getCode());
				System.out.println("Subject : "+b.getSubject());
				System.out.println("-----------------------");
			}
		}
		else
		{
			System.out.println("Invalid Name");
		}
	}
}
