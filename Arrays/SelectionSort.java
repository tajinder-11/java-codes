package Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 7, 2, 6, 1, 4 };

		for (int i = 0; i < arr.length; i++) {

			int min = i;   // array de ith index nu apa min mannage.
			
			for (int j = i+1; j < arr.length; j++) {

				if(arr[min] > arr[j]) {  // condition  boldi a k jekar array da min arr de j ton wadda a ta 
					min = j;
				}
			}
			
			if(i!= min) {  // jekar array da i min de braabar nhi a ta array de dona elements nu swap kr dena a.
				int temp = arr[i]; 
				arr[i] = arr[min];
				arr[min]= temp;
			}
			
		}
		System.out.println("After sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
