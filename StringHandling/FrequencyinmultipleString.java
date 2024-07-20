package StringHandling;

import java.util.Arrays;

public class FrequencyinmultipleString {

	public static void main(String[] args) {

		String str = "i love football because i love sports";

		String[] arr = str.split(" ");
		Arrays.sort(arr);
		int c = 1;
		int i;

		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i].equals(arr[i + 1])) {
				c++;
			}
			if (!arr[i].equals(arr[i + 1])) {

				System.out.println(arr[i] + " comes " + c + " times");
				c = 1;
			}

		}
		System.out.println(arr[i] + " comes " + c + " times");
	}

}
