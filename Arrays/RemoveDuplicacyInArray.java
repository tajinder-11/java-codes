package Arrays;

import java.util.Arrays;

// es program ch apa array cho duplicacy nu remove krna a 
// which means agar koi element repeat v hunda a ta oh sirf 
// ik vaar hi print hona chahida a 
public class RemoveDuplicacyInArray {

	public static void main(String[] args) {

		int[] arr = {2, 6, 3, 2, 2, 3, 7, 4};
		          //{2, 2, 2, 3, 3, 4, 6, 7}
		Arrays.sort(arr);                  // sb ton pehla ta array nu apa ne sort kr laina a.

		int[] brr = new int[arr.length];  // fr ik new array bnona a kyunki jdo koi ith index da element i+1 naal match
		                                  // na kre ta apa ne os element nu es array vich paa dena a.

		int i, k = 0;
		int c = 1;

		for (i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) { // jekar array de next wala element same a ta count nu+ kri jana a.
				c++;
			}
			if (arr[i] != arr[i + 1]) {  // jekar array de next wala element i de braabar nhi a ta apa i wale
				                         // element nu new array vich paa dena a
					brr[k] = arr[i];
					k++;
					c=1;
			}
		}
			brr[k] = arr[i]; // last wale index nu lain lyi kyunki apa loop length-1 tk chalaya c jo ki last ale element
			k++;             // nu nhi chukuga. 

			for (i = 0; i < k; i++) {
				System.out.print(brr[i] + " ");
			}
		}

	}


