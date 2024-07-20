package Practice;

public class minmax {

	public static void main(String[] args) {

		int[] arr = {12,33,56,23,87,56,34};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value is : " + max);
		System.out.println("Minimum value is : " + min);

	}

}
