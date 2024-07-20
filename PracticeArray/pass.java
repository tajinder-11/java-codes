package PracticeArray;

import java.util.Scanner;

public class pass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int k = sc.nextInt();
		int count = 1; 
		int pass = 0;
		
		while(count < k-1)
		{
			pass = pass * 10 + 1;
			count++;
		}
		
		pass = pass * 10 + 2;
		pass = pass * 10 + k;
		
		
		System.out.println(pass);

	}

}
