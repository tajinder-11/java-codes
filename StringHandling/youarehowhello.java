package StringHandling;
// Program to reverse a String in java.
public class youarehowhello {

	String fun(String str) {
		
		String arr[] = str.split(" ");
		String g = "";

		int i;

		for (i = arr.length - 1; i >= 0; i--) {

			g = g + arr[i];
			g = g + " ";
		}
		return g.trim();
	}

	public static void main(String[] args) {
		String str = "hello how are you";
		youarehowhello obj = new youarehowhello();
		String ans = obj.fun(str);
		System.out.println(ans);

	}

}
