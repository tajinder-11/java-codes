package Practice;

public class strngnmber 
{

	public static void main(String[] args)
	{
		
		int num = 145;
		int temp = num;
	    int sum = 0;
		
		while(num > 0)
		{
			int r = num % 10;
			int f = 1;
			for(int i = r; i > 0; i--)
			{
				f = f * i;
			}
			
			sum = sum + f;
			System.out.println(f);
			num = num / 10;
		}
		
		if(sum == temp)
		{
			System.out.println("it is Strong number");
		}
		else
		{
			System.out.println("it is not Strong number");
		}
		
	
	}

}
