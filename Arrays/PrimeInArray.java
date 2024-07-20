package Arrays;

// find the sum of an element of array is prime or not 

public class PrimeInArray {

	public static void main(String[] args) {

		int[] arr = { 12, 7, 16, 23, 98, 56, 45 };
		int i;

		for (i = 0; i < arr.length; i++) {
			int num = arr[0]; // sb ton pehla ta apa array de 0th index ton start krk hr ik element nu chakkna a.
								
			int sum = 0;

			while (num > 0) {

				int rem = arr[i] % 10;
				arr[i] = arr[i] / 10;
				sum = rem + sum;
			}
			
			int c = 0;
			for (i = 1; i < arr.length; i++) {
				if (sum % i == 0) {
					c++;
					System.out.println(c);
				}
			}
			
			
			

		}

	}

}
