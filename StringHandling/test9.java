package StringHandling;

//222x22 = 224
public class test9 {

	int fun(String str) {
		int i, c = 0, sum = 0;

		for (i = 0; i < str.length();i++) {
			char ch = str.charAt(i);

			if (ch >= 48 && ch <= 57) {
				c = c++;
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
