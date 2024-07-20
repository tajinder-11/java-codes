package StringHandling;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Firdausi";
		int i;
        System.out.println("Reverse Printing");
		for (i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}