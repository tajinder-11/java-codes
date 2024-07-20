package Arrays;

public class zeroes {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 0, 4, 0, 7, -5, 8, 0 }; // Output: 25784-57000
		int i;

		for (i = 0; i < arr.length; i++) {// first loop nu siddha chalona te i di value nu fix kr dena a.
			
			for (int j = arr.length - 1; j > i; j--) {// second loop nu pisheo ulta chalona a.
				
				if (arr[i] == 0 && arr[j] != 0) {// jd i= 0 jove te j!=0 hoe ta dona nu swaap kr dena a.
					int t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
