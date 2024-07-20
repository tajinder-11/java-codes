package DualLoop;

// 0 1 1 2 3 4 8 13

 import java.util.*;
 public class FibonacchiSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int a = 0, b = 1;
		int c = a + b;
		System.out.print(a + " " + b + " " + c + " ");

		for (int i = 1; i <= n; i++) {

			a = b;
			b = c;
			c = a + b;
			System.out.print(c+ " ");
		}
	}
}
