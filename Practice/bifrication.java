package Practice;

public class bifrication {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 1, 3, 7, 8, 9, 4, };
		int[] odd = new int[arr.length];
		int[] even = new int[arr.length];

		int i, j = 0, k = 0;

		for (i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				even[j] = arr[i];
				j++;
			}
			if (arr[i] % 2 != 0) {
				odd[k] = arr[i];
				k++;
			}
		}
		System.out.println("odd wale: ");
		for (i = 0; i <k; i++) {
			System.out.println(odd[i]);
		}
		System.out.println("even wale: ");
		for (i = 0; i < j; i++) {
			System.out.println(even[i]);
		}

	}

}
