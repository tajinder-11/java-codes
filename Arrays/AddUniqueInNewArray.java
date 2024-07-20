package Arrays;

import java.util.Arrays;
/*
  eh wale question vich aapa given array de unique elements nu 
  new array vich paa k print krna a 
   
 */
public class AddUniqueInNewArray {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 3, 2, 2, 3, 7, 4 };
		int[] temp = new int[arr.length];

		Arrays.sort(arr);

		int i, k = 0;
		int c = 1;

		for (i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				c++;
			}
			if (arr[i] != arr[i + 1]) {

				if (c == 1) {
					temp[k] = arr[i];
					k++;

				}
				c = 1;
			}
		}
		if(c==1) {
			temp[k] = arr[i];
			k++;
		}

		for (i = 0; i < k; i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
