package OOPS;

class kl{
	
	kl()
	{
	System.out.println("hello ji");	
	}
	
}
class ms extends kl{
	
	ms()
	{
		System.out.println("hey buddy");
	}
}
public class ConstructorChaining extends ms{
	
	ConstructorChaining()
	{
	System.out.println("i am in main class");
	}

	public static void main(String[] args) {
		
		ConstructorChaining obj = new ConstructorChaining();
		
	}

}
