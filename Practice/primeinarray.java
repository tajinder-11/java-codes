package Practice;

public class primeinarray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 7, 3, 8 };
		int c = 0;
		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];

			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println("prime numbers are: " + arr[i]);
			}
			c = 0;
		}

	}

}
