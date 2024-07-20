package OOPS;

public class StrongInFunction {

	
	int factorial(int r)
	{
		int i , f=1;
		
		for( i = r ; i > 0 ; i--) {
			f = f * i;
		}
		return f;
		
	}
	int fun(int num )
	{
		int sum= 0;
		 while(num > 0) {
			 
			 int r = num % 10;
			 int g = factorial(r);
			 sum = sum + g;
			 num = num /10;
		 }
		 return sum;
	}
	public static void main(String[] args) {
		
		int num = 145;
		StrongInFunction obj = new StrongInFunction();
		int ans = obj.fun(num);
		if(ans == num)
		{
			System.out.println("The number is strong number ");
		}
		else 
		{
			System.out.println("not a strong number ");
		}

	}

}
