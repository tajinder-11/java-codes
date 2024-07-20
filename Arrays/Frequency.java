package Arrays;

import java.util.Arrays;

// finding frequency and unique element in an array 

public class Frequency {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 3, 2, 2, 3, 7, 4 };
		// 2, 2, 2, 3, 3, 4, 6, 7
		Arrays.sort(arr);
		int i;

		int c = 1;
		for (i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				c++;
			}
			if (arr[i] != arr[i + 1]) {
				
				System.out.println(arr[i] + " comes" + c + " times");
				c = 1;   //  jekar apa c==1 nhi kitta ta ohne continously count kri jana a.
			}
		}
		System.out.println(arr[i] + " comes" + c + " times");

	}

}
