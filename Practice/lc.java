package Practice;

public class lc {

	public static void main(String[] args) {

		int[] arr = {1,7,4,2,8,6};
		
		int element = 7;

		for (int i = 0; i < arr.length; i++) {

			if (element == arr[i]) {
				
				System.out.println("item found at index : " + i);
				break;
			}
		}

	}

}

