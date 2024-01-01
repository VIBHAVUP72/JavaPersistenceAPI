package org.jsp.embedded;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchPerson 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your mail Id and Phone Number");
		String email = sc.next();
		long phone = sc.nextLong();
		
		PersonId id = new PersonId();
		id.setEmail(email);
		id.setPhone(phone);
		
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Person p = m.find(Person.class, id);
		if(p!=null)
		{
			System.out.println("Name : "+p.getName());
			System.out.println("Email ID : "+p.getId().getEmail());
			System.out.println("Phone Number : "+p.getId().getPhone());
		}
		else
		{
			System.out.println("INVALID Phone Number or Email");
		}
	}
}
