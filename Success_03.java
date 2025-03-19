package persistance_01;

public class Success_03 {

	//using this keyword to reassign the global variable using this keyword
	int gold=34;
	
	public void tenent(int gold)
	{
		this.gold=gold;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Success_03 s = new Success_03();
		s.tenent(5);
		System.out.println(s.gold);

	}

}
