package OOPS2;

public class CBB {

	int fun(int x) {
		int i, f = 1;

		for (i = x; i > 0; i--) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {

		int num = 5;
		int sum =0;

		for (int i = 1; i <= 5; i++) {
			CBB cb = new CBB();
			int ans = cb.fun(i);
			sum = sum + ans;
			System.out.println("Factorial is : " + ans);
		}
		System.out.println("Sum is : " + sum);

	}

}
