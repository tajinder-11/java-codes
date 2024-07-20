package OOPS;

import java.util.Scanner;

public class PrimeInFunction {

	boolean fun(int x) {
		int c = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		PrimeInFunction obj = new PrimeInFunction();
		boolean ans = obj.fun(num);
		if (ans == true) {
			System.out.println("the number is prime");
		}
		if (ans == false) {
			System.out.println("the number is not prime");
		}
	}   
}
