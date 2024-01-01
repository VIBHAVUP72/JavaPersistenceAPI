package org.jsp.jpademo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllEmployees {
	public static void main(String[] args) 
	{
		String qry = "select e from Employee e";
		EntityManagerFactory f = Persistence.createEntityManagerFactory("dev");
		EntityManager m = f.createEntityManager();
		Query q = m.createQuery(qry);
		List<Employee> emps = q.getResultList();
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
}
