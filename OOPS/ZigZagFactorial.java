package OOPS;

//  1! - 2! + 3! - 4! + 5!
public class ZigZagFactorial {

	int fun(int x) {

		int f = 1, i;

		for (i = x; i > 0; i--) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {

		ZigZagFactorial obj = new ZigZagFactorial();
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			
			int ans = obj.fun(i);
			System.out.println(ans);
			sum = sum + ans;
			if(sum % 2==0) {
				sum = sum - ans;
			}
			else {
				sum = sum + ans;
			}
			System.out.println("your sum is : " + sum);
		}
	}

}
