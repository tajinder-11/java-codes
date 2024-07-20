package DualLoop;

public class PrimeInRange 
{

	public static void main(String[] args) 
	{

		int num, i , count =0 ;
		
		for (num = 2; ; num++)  // it is an infinite loop so jinne no saanu cahide a and jdo (count == that no hove) td fr break lga dena a 
		{
			
			int c = 0; // count ko andar declare krna hai kyunki c ki value ko baar baar recenter krna hai
			
			for (i = 1; i <= num; i++) 
			{
				
				if (num % i == 0) 
				{
					c++;	
				}

			}
			if(c==2)
			{
				count++;
				System.out.println(num + " is a prime number");
			}
			if(count==150) {
				break;
			}
			
		}
		System.out.println("total " + count);
	

	}

}
