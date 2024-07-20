package Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 7, 2, 1, 4, 6 };
		int i;

		for (i = 1; i < arr.length; i++) { // loop ,must be start from 1 index

			int key = arr[i];
			int j = i - 1;

			while(j >= 0 && key < arr[j]) {  // jdo j di value j ton >= hove ta loop tutt jaye te j di value j+1 ch paa deni 
				                              // and jdo key di value j element ton wadda hove ta condition break ho jani a 

				arr[j + 1] = arr[j]; // j wale element nu j + 1 te sutt dita a
				j--;
			}
			
			arr[j+1] = key;  // jdo dono conditions tutt jaan ta j+1 di jgah apa apma key element sutt dena a.
		}
		System.out.println("After Sorting : ");
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
