package Practice;

public class Arrayprime {

	public static void main(String[] args) {

		int c = 0;
		int[] arr = { 2, 7, 12, 4, 9 };

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];

			for (int j = 1; j <= num; j++) {

				if (num % j == 0) {
					c++;
				}
			}

			if (c == 2) {
				System.out.println(" prime number are : " + arr[i]);
			}
			c = 0;
		}

	}

}
