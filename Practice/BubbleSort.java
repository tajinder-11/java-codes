package Practice;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 6, 7, 8, 2, 5, 9, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 1; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
