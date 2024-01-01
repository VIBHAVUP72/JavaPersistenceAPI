package org.jsp.jpademo;

import java.util.List;
import java.util.Scanner; 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchByName {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to Fetch Details");
		String name = sc.next();
		String qry = "select e from Employee e where e.name=?1";
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		Query q = m.createQuery(qry);
		q.setParameter(1, name);
		List<Employee> emps = q.getResultList();
		if(emps.size()>0)
		{
			for(Employee e : emps)
			{
				System.out.println("ID : "+e.getId());
				System.out.println("Name : "+e.getName());
				System.out.println("Department : "+e.getDept());
				System.out.println("Designation : "+e.getDesg());
				System.out.println("Salary : "+e.getSalary());
				System.out.println("-------------------------");
			}
		}
		else
		{
			System.out.println("No Employee Found of Name "+name);
		}
		sc.close();
	}
}
