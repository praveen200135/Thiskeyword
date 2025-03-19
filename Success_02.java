package persistance_01;

public class Success_02 {
	
	//default method
	public void empty()
	{
		System.out.println("default method");
		this.empty2(5, 6);
	}
	//one parameterized method
	public void empty1(int a)
	{
		System.out.println("one parameter method");
		this.empty4(5,6,7,8);
	}
	//two parameterized method
	public void empty2(int c,int f)
	{
		System.out.println("two parameter method");
		this.empty1(3);
	}
	
	//three parameterized method
	public void empty3(int c,int d,int f)
	{
		System.out.println("three parameter method");
		this.empty();
	}
	//four parameterized method
	public void empty4(int a,int b,int c,int d)
	{
		System.out.println("four parameter method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Success_02 s = new Success_02();
		s.empty3(2,4,6);
		
		
	}

}
