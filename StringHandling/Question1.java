package StringHandling;

// program to find the sum of continous digits in a string "abc75@xy23mn2" :- (75 + 23 + 2) = 100

public class Question1 {

	boolean fun(char ch) {                   // This is the function to find digits in an string. 
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Question1 obj = new Question1();

		String str = "abc75@xy23mn2";

		int i, num = 0, sum = 0;
		for (i = 0; i < str.length() -1; i++) {
			
			char ch = str.charAt(i);
			
			if (obj.fun(ch))               // jekar ch ik digit a ta es loop ch vad k apna kmm kre.
			{
				int n = ch - 48;         // 7 da ascii code 55 a so thos no lain lyi oh 55 cho 48 minus krk apa nu 7  as a digit mil jauga.
				num = num * 10 + n;     // digits da number bnaun lyi eh formula use krida hunda a.

				if (!obj.fun(str.charAt(i + 1))) { // jekar digit de agge wala akhar digit nhi a ta apa jo number bnaye a ohna da sum kr dena a. 
					sum = sum + num;
					num = 0;
				}
			}
		}
		char c = str.charAt(i);  // i++ ho k last te pujj gi c but condition wrong hon di vajah de naal oh andar enter ni hoi.
	                             // so aapa ne ik nve variable vich i nu store krwa lea and fr ohi number bnuan wala loop chla ditta.	
		if(obj.fun(c))
		{
			int n = c - 48;
			num = num * 10+n;
			sum = sum + num;
		}
		System.out.println("sum = " +sum);

	}

}
