package OOPS;

public class FactorialUsingFunction {
	
	int fun(int x) {
		
		int i, f = 1;
		
		for (i = x; i > 0; i--) {
			
		      f = f * i;
		      
		}
		return f;
	}
	
	public static void main(String[] args) {
		
		int i, sum =0;
		FactorialUsingFunction obj = new FactorialUsingFunction();
		
		for (i = 1; i <= 5; i++) {
			
			int ans = obj.fun(i);
			System.out.println("Answer is : " + ans);
			sum = sum + ans;
		}
		System.out.println("Sum is : " + sum);
	}
}