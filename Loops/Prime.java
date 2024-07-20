package Loops;

public class Prime 
{

	public static void main(String[] args) 
	{

		int num = 7;
		int c = 0;

		for (int i = 1; i <= num; i++) 
		{

			if (num % i == 0) 
			{ // used to get factors of the number

				c++; // used to calculate how many factors are there

				System.out.println(" " + i + " ");

			}
		}

		if (c == 2) 
		{
			System.out.println(" the no is prime");
		} 
		else 
		{
			System.out.println("not prime");
		}
	}
}
