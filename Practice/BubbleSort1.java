package Practice;

public class BubbleSort1 {

	public static void main(String[] args) {

		int[] arr = { 90, 45, 62, 13, 9, 6, 56, 89, 65 };

		for (int i = 0; i < arr.length-1; i++) {

			for (int j = 0; j < arr.length-1; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Swapping : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
