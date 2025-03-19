package persistance_02;

public class Succes_04 {

	public Succes_04()
	{
		this (2,4);
		System.out.println("parent default constructor");		
	}
	
	public Succes_04(int c)
	{
		this(2,4,6);
		System.out.println("parent one parameterized constructor");
	}
	public Succes_04(int a,int b)
	{
		
		System.out.println("parent two parameterized constructor");
	}
	public Succes_04(int a,int b,int c)
	
	{
		this();
		System.out.println("parent three parameterized constructor");
	}

	
}
