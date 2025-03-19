package persistance_01;

public class Success_01 {
	
	//default constructor
	public Success_01()
	{
		this(2,4,5);
		System.out.println("default constructor");
	}
	//one parameterized
	public Success_01(int c)
	
	{
		this();
		System.out.println("one constructor");
	}
	//two parameterized
	
	public Success_01(int a,int b)
	{
		this(3);
		System.out.println("two constructor");
	}
	
	//three parameterized
	public Success_01(int a,int b,int c)
	{
		System.out.println("three constructor");
	}
	//four parameterized
	public Success_01(int a,int b, int c,int d)
	{
		this(2,3);
		System.out.println("four constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Success_01 s = new Success_01(2,3,4,5);

	}

}
