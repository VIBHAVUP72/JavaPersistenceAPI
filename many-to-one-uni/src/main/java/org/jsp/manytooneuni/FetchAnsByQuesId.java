package org.jsp.manytooneuni;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAnsByQuesId 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Question ID to Find the Answers");
		int qid = sc.nextInt();
		String qry = "select a from Answer a where a.question.id=:id";
		EntityManager m = Persistence.createEntityManagerFactory("dev").createEntityManager();
		Query q = m.createQuery(qry);
		q.setParameter("id", qid);
		List<Answer> ans = q.getResultList();
		for(Answer a : ans)
		{
			System.out.println(a.getAns()+"  -by "+a.getAnsBy());
		}
		sc.close();
	}
}
