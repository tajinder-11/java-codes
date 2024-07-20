package Arrays;

// 11 22 33 44 55 
//  0  1  2  3  4
// 22 33 44 55 11 
public class Rotation {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 };
		int j, i;
		//for (j = 0; j < 3; j++) {

			int t = arr[0];
			for (i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];            // array de ith index te apa i+1 wale element nu paa dena a.
			}
			arr[arr.length - 1] = t;           // fr apa t wale element nu t te paa dena a jo ki array da 0th index c.

			System.out.println("Aftrer Rotation : ");   // fr end te apa print kr dena array nu.
			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

		//}

	}

}
