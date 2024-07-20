package Practice;

public class test {

	int factorial(int x) {
		int f = 1;
		for (int i = x; i > 0; i--) {

			f = f * i;
		}
		return f;
	}

	int fun(int num) {
		int sum = 0;
		while (num > 0) {

			int r = num % 10;
			int g = factorial(r);
			sum = sum + g;
			num = num /10;

		}
		return sum;

	}

	public static void main(String[] args) {

		int num = 145;
		test t = new test();
		int ans = t.fun(num);
	     
		if(ans == num) {
			System.out.println("Number is strong ");
		}
		else {
			System.out.println("Number is not strong");
		}
	}
}
