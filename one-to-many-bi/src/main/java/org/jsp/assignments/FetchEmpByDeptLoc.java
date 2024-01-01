package org.jsp.assignments;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.onetomanybi.Employee;

public class FetchEmpByDeptLoc 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Department Location to Find the Employee");
		String dloc = sc.next();
		String qry = "select e from Employee e where e.dept.loc=:loc";
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = m.createQuery(qry);
		q.setParameter("loc", dloc);
		List<Employee> emp = q.getResultList();
		for(Employee e : emp)
		{
			System.out.println("Name : "+e.getName());
			System.out.println("Designation : "+e.getDesg());
			System.out.println("Department Name : "+e.getDept().getName());
			System.out.println("Department Location : "+e.getDept().getLoc());
			System.out.println("Salary : "+e.getSal());
			System.out.println("---------------------------------");
		}
		sc.close();
	}
}
