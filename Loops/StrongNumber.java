package Loops;

// 145 = 1! + 4! + 5!  = 1 + 24 + 120 = 145

public class StrongNumber {

	public static void main(String[] args) {
		
		int num = 145;
		int sum =0;
		int t = num;
		
		while(num>0) {
			
			int r = num % 10;
			int f =1;
		   
			for(int i = r; i > 0;i--) {
				 f = f * i;
			}
			sum = sum + f;
			System.out.println(f);
			num = num/10;
		}
		System.out.println("Sum = " + sum);
		
		if(sum == t)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not strong");
		}

	}

}
