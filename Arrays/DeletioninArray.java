package Arrays;

import java.util.Scanner;

public class DeletioninArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 22, 33, 44, 55};


		System.out.println("Enter the position : ");
		int pos = sc.nextInt();
		pos = pos-1;

		for (int i = pos; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
			
		}
		
		System.out.println("After Deletion ");
		for(int i=0;i<arr.length -1;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
