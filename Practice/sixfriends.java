package Practice;

import java.util.Scanner;

public class sixfriends {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int doubler = x * 3;
			System.out.println(doubler);
			int tripler = y * 2;
		}
		

	}

}
