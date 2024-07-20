package Arrays;

public class SwapAdjacentElement {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 };

		for (int i = 0; i < arr.length - 1; i = i + 2) {

			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		System.out.println("After Swapping : ");
		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println(arr[i]);

		}

	}
}