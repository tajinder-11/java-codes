package Loops;

// 2^5 = 2*2*2*2*2

public class Power {

	public static void main(String[] args) {

		int a = 2, b = 5;
		int f = 1;

		for (int i = 0; i < b; i++) {

			f = a * f;
		}
		System.out.println(f);
	}

}
