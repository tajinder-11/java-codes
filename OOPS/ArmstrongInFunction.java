package OOPS;

public class ArmstrongInFunction {

	int digitnikalo(int num) {
		int c = 0;

		while (num > 0) {
			c++;
			num = num / 10;
		}
		return c;

	}

	int power(int a, int b) {

		int f = 1;
		for (int i = 0; i < b; i++) {
			f = a * f;
		}
		return f;
	}

	int fun(int num) {
		
		int sum = 0;
		int count = digitnikalo(num);
		while (num > 0) {

			int r = num % 10;
			sum = sum + power(r, count);
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int num = 153;
		ArmstrongInFunction obj = new ArmstrongInFunction();
		int ans = obj.fun(num);
		
		if(ans == num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}

	}

}