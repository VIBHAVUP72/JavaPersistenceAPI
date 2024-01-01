package onetoone;

import java.time.LocalDate;

public class PanCard 
{
	private static int incr;
	private int id;
	
	{
		id = ++incr;
	}
	
	private String number;
	private LocalDate dbl;
	private int pincode;
	
	public String getNumber() 
	{
		return number;
	}
	public void setNumber(String number) 
	{
		this.number = number;
	}
	public LocalDate getDbl() 
	{
		return dbl;
	}
	public void setDbl(LocalDate dbl) 
	{
		this.dbl = dbl;
	}
	public int getPincode() 
	{
		return pincode;
	}
	public void setPincode(int pincode) 
	{
		this.pincode = pincode;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
}
