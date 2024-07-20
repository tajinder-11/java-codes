package Arrays;
// Array is collection of similar types of Data elements 
// Array is first data structure 

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		// int [] arr = { 12,14,45,56,87}; // Direct way of storing elements

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements are : ");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("sum : " + sum);
	}
}