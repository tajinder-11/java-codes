package DualLoop;

import java.util.Scanner;

public class ArmstrongInRange 
{
// 153 = 3^3 + 5^3 + 1^3
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter the start : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending : ");
		int end = sc.nextInt();
		
		for(num=start; num<=end; num++) 
		{
			int t = num;
			int c = 0;	
			
			while (num > 0) 
			{
				c++;
				num = num / 10;
			}
			num = t;
			
			int sum = 0;
			while(num > 0) 
			{	
				int r = num % 10;
			    sum = sum + (int)Math.pow(r, c);
			    num = num/10;
			}
			num =  t;
			if(t==sum) 
			{
				System.out.print(t+" ");
			}
		}
	}
}
