package onetoone;

import java.time.LocalDate;

public class Test 
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setName("Rawnak");
		p1.setAge(21);
		p1.setPhone(8107664092l);
		
		PanCard c = new PanCard();
		c.setDbl(LocalDate.parse("2000-12-01"));
		c.setNumber("mbkp383");
		c.setPincode(560076);
		p1.setCard(c);
		
		System.out.println("Personal Details");
		System.out.println("ID : "+p1.getId());
		System.out.println("Name : "+p1.getName());
		System.out.println("Age : "+p1.getAge());
		System.out.println("Phone : "+p1.getPhone());
		System.out.println("DOB : "+p1.getCard().getDbl());
		System.out.println("PanCard Number : "+p1.getCard().getNumber());		
	}
}
