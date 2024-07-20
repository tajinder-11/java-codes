package Arrays;

import java.util.Scanner;

public class Maxinarray {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size : ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("Enter the elements : ");
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		System.out.println("Elements are : ");
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println(arr[i]);
//		}

		int [] arr = {12, 4, 32, 7, 11, 24};
		
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
