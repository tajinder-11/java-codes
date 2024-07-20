package Arrays;

// major array de odd wale elements nu odd ale new array ch paauna 
// major array de even wale numbers nu even ale array ch paauna a 

public class BifricationOddEven {

	public static void main(String[] args) {

		int[] arr = { 9, 3, 7, 4, 5, 6 };
		int[] odd = new int[arr.length];
		int[] even = new int[arr.length];
		int i, j = 0, k = 0;             // new varables j and k es krk lye kyunki indexing maintain rkhni hundi a 

		for (i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				even[j] = arr[i];   // indexing maintain rkhn vaaste apa arr[i] di value nu even[j] ch paauni a 
				j++;                // te j++ krna ta ki next element os de agle index te aa jave 
			}
			if (arr[i] % 2 != 0) {
				odd[k] = arr[i];  // odd numbers nu odd wale array de indxex te paauna a.
				k++;
			}
		}
		System.out.println("even wale : ");

		for (i = 0; i < j; i++) {
			System.out.println(even[i]);  // ethe apa value i di print kroni a kyunki elementa arr ch pye a.
		}
		System.out.println("odd wale : ");
		for (i = 0; i < k; i++) {
			System.out.println(odd[i]);
		}

	}

}
