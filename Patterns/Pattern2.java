package Patterns;
/*
  
 0 
 01
 012
 0123
 01234
 
 */

public class Pattern2 {

	public static void main(String[]args) {
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j<=i ;j++) 
			{
				System.out.print(j);	
			}
			System.out.println(" ");
		}
	}
}
