package Patterns;

import java.util.Scanner;
public class Testing2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the number : ");
			int num = sc.nextInt();
			
			for(int j = 1; j < 11; j++) {
				System.out.print(num * j+ " ");
			}
			System.out.println();
		}
		

	}

}
