package persistance_02;

public class Success_05 extends Succes_04{
	
	
	public Success_05()
	{
	this(2,4,6);
		System.out.println("child default constructor");
	}
	
	public Success_05(int c)
	{
		this();
		System.out.println("child one parameterized constructor");
	}
	public Success_05(int a,int b)
	{
		this(4);
		System.out.println("child two parameterized constructor");
	}
	public Success_05(int a,int b,int c)
	{
		super(1);
		System.out.println("child three parameterized constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Success_05 s = new Success_05(4,5);
	}

}
