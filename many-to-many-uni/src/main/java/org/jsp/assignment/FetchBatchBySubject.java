package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanyuni.Batch;

public class FetchBatchBySubject 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Subject to Fetch Batch");
		String sub = sc.next();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select b from Batch b where b.sub=?1";
		Query q = m.createQuery(qry);
		q.setParameter(1,sub);
		List<Batch> btch = q.getResultList();
		if(btch.size()>0)
		{
			for(Batch b : btch)
			{
				System.out.println("ID : "+b.getId());
				System.out.println("Name : "+b.getSub());
				System.out.println("Phone Number : "+b.getCode());
				System.out.println("------------------");
			}
		}
		else
		{
			System.out.println("Invalid Name");
		}	
	}
}
