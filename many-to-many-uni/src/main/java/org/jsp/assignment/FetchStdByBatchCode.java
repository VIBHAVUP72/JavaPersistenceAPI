package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.jsp.manytomanyuni.Student;

public class FetchStdByBatchCode 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch Code to Fetch Students");
		String bcode = sc.next();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select b.std from Batch b where b.code=?1";
		Query q = m.createQuery(qry);
		q.setParameter(1, bcode);
		List<Student> std = q.getResultList();
		if(std.size()>0)
		{
			for(Student s : std)
			{
				System.out.println("ID : "+s.getId());
				System.out.println("Name : "+s.getName());
				System.out.println("Phone Number : "+s.getPhone());
				System.out.println("------------------");
			}
		}
		else
		{
			System.out.println("Invalid Batch Code");
		}
	}
}
