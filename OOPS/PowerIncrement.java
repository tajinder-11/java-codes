package OOPS;

// x^1 + x^2 + x^3 + x^4 + x^5
public class PowerIncrement {
	int fun(int a, int b) {

		int f = 1;

		for (int i = 0; i < b; i++) {

			f = f * a;
		}
		return f;
	}

	public static void main(String[] args) {
        int sum = 0;
		PowerIncrement obj = new PowerIncrement();
		for (int i = 1; i <= 5; i++) {
			int ans = obj.fun(2, i);
			System.out.println("Answer is : " + ans);
			sum = sum + ans;
		}
		System.out.println("sum is : "+ sum);

	}

}
