package Practice;

public class factors {

	public static void main(String[]args)
	{
		int num = 7;
		int c = 0;
		for(int i = 1; i <=num ;i++)
		{
			if(num % i==0)
			{
				c++;
			}
			
		}
		
		if(c==2) {
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}	
	}
}
