package Arrays;

// 1 2 3 4 5 
// 1 * (2+3+4+5)
// 2 * (1+3+4+5)
// 3 * (1+2+4+5)
// 4 * (1+2+3+5)
// 5 * (1+2+3+4)

public class Test {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[j];
			}
			sum = sum - arr[i];
			sum = sum * arr[i];

			System.out.println(sum);
		}

	}

}
