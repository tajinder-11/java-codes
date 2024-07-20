package Recursion;

public class Reverse {

	int sum = 0;
	int fun(int num) {
		
		if (num == 0) {
			return 0;
		} else {
			int r = num % 10;
			sum = sum * 10 + r;  // ik thos number bnaun da formula.
			fun(num / 10);
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int num = 1234;
		Reverse obj = new Reverse();
		int ans = obj.fun(num);
		System.out.println(ans);

	}

}
