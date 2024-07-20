package Practice;

import java.util.Scanner;

public class multiplyStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		String a = sc.next();
		System.out.println("enter the second number");
		String b = sc.next();
		
		int d = Integer.parseInt(a);
		int f = Integer.parseInt(b);
		
		System.out.println(d * f);
		
	}

}
