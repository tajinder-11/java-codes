package Loops;

public class Palindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			
			int r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		
		}
		System.out.println("sum = " + sum);
		
		if(temp == sum ) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
