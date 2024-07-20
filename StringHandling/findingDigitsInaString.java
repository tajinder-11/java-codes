package StringHandling;

// program to find digits in a string, and then adding it 

//ASCII 0 = 48,   9 = 57
public class findingDigitsInaString {

	int fun(String str) {
		int i, c = 0, sum = 0;
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 48 && ch <= 57) {
				c++;
				int num = ch - 48;
				sum = sum + num;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		
	    String str = "hello@222x22";
		findingDigitsInaString obj = new findingDigitsInaString();
		int ans = obj.fun(str);
		System.out.println(ans);
	}
}
