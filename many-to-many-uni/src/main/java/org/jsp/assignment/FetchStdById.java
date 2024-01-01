package org.jsp.assignment;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.manytomanyuni.Student;

public class FetchStdById 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID to Fetch Details");
		int sid = sc.nextInt();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		String qry = "select s from Student s where s.id=?1";
		Query q = m.createQuery(qry);
		q.setParameter(1,sid);
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
			System.out.println("Invalid Name");
		}	
	}
}
