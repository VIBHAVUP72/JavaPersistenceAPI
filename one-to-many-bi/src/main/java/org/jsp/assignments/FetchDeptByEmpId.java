package org.jsp.assignments;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.jsp.onetomanybi.Department;
import org.jsp.onetomanybi.Employee;

public class FetchDeptByEmpId 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Employee ID to Find the Department");
		int eid = sc.nextInt();
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Employee e = m.find(Employee.class, eid);
		if(e!=null) 
		{
			Department d = e.getDept();
			System.out.println("ID : "+d.getId());
			System.out.println("Name : "+d.getName());
			System.out.println("Location : "+d.getLoc());
			System.out.println("-------------------------");
			
		}
		sc.close();
	}
}
