package TajinderSingh;

import java.util.Scanner;

public class GreaterBetween {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();
		System.out.println("Enter the value of c : ");
		int c = sc.nextInt();
		
		
		if(a>b) {
			
			if(a>c) {
				System.out.println("a sabse vadda");
			}
			else {
				System.out.println("c sabse wadda");
			}
			
		}

		else {
			if(b>c) {
				System.out.println("b sabse wadda");
			}
			else {
				System.out.println("c sabse wadda");
			}
			
		}
	}

}
