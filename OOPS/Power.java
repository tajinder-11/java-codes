package OOPS;

public class Power {

	int pow(int a, int b) {
		int f = 1;
		for (int i = 0; i < b; i++) {

			f = a * f;
		}
		return f;
	}

	public static void main(String[] args) {

		Power obj = new Power();
		int ans = obj.pow(2, 5);
		System.out.println("answer is : " + ans);
	}

}
