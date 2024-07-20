package Loops;
import java.util.*;

// programto find odd numbers within a range

public class Odd_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value");
		
		int n = sc.nextInt();
		
		for(int i=1 ;i <= n;i++)
		{
			if(i % 2 != 0) 
			{
				System.out.println(i);
			}
			
		}

	}

}
