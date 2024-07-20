package Loops;

// 5 * 4* 3 * 2 * 1 

public class Factorial {

	public static void main(String[] args) {

		int num = 5, i;
		int f = 1;
		
		for (i = num; i > 0; i--) {
			
			f = i * f;  // 1 = 1 * 5=5 , 5 = 4 * 5= 20, 20 = 3 * 20= 60, 60 = 2 * 60=120, 120 = 1* 120= 120 factorial of 5 
			
		}
		System.out.println(f);
	}
}
