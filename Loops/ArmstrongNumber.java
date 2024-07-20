package Loops;

//153 : 1^3 + 5^3 + 3^3
//    : 1   + 125 + 27 = 153
//1634: 1^4 + 6^4 + 3^4 + 4^4

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 153;
		int t = num;

		int c = 0;

		while (num > 0) {
			c++;
			num = num / 10;
		}
		
		num = t;      // num nu preserve krk rkhna a kyunki num di value 0 ho chukki a. 
		int sum = 0;
		
		while(num > 0) {
			
			int r = num % 10;
			int pow = (int)Math.pow(r, c);
		    sum = sum + pow;
		    num = num / 10;
		}
		
		if(t == sum)
		{
			System.out.println("Armstrong number");
		}
		else 
		{
			System.out.println("not armstrong");
		}
	}

}
