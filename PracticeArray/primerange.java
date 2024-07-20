package PracticeArray;

public class primerange {

	public static void main(String[]args)
	{
		int num ;
		int i, count = 0;
		
		
		for(num = 2; ; num++)
		{
			int c = 0;
			
			for( i = 1; i <= num; i++)
			{
				if(num % i ==0)
				{
					c++;
				}
			}
			
			if(c==2)
			{
				count++;
				System.out.println(num);
			}
			if(count == 10)
			{
				break;
			}
			
		}
	}
}
