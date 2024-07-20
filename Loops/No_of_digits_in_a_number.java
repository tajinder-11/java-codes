package Loops;

public class No_of_digits_in_a_number
{

	public static void main(String[] args) 
	{
		
		int num = 65432653;
		
		int c = 0;
		
		while(num > 0) 
		{
			c++;
			num = num/10;	
		}
		System.out.println(c);
	}

}
