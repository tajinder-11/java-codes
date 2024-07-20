package Arrays;

public class BubbleSort {

	// compare the adjacent elements and if j is less than j-1 then swap the numbers

	// 6 3 9 7
	

	public static void main(String[] args) {

		int[] arr = { 6, 3, 9, 7 };

		int i, j;

		for (i = 0; i < arr.length - 1; i++) { // for steps

			for (j = 0; j < arr.length - 1; j++) { // for comparisons

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println("After Sorting : ");

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
