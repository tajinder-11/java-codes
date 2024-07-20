package StringHandling;

// program to find number of consonents in a string 
public class findingNoOfConsonents {

	int fun(String str) {

		int i, c = 0;

		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			} 
			else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { 
				continue;
			}
			c++;
		}
		return c;
	}

	public static void main(String[] args) {

		String str = "tajinder";
		findingNoOfConsonents obj = new findingNoOfConsonents();
		int ans = obj.fun(str);
		System.out.println(ans);

	}

}
