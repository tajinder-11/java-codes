package Arrays;

// Array must be in a sorted order

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c=0;
		int[]arr = {11,22,33,44,55};
		
		int start = 0;
		int end = arr.length-1;
		
		int mid = start + (end -start) /2;
		
		System.out.println("Enter the element to be searched : ");
		int target = sc.nextInt();
		
		
		while(start<=end) {
			
			if(target==arr[mid]) {
				c++;
				System.out.println("element found ");
				break;
			}
			if (target > arr[mid]) {
				start = mid+1;
			}
			if(target < arr[mid]) {
				end = mid-1;
			}
			mid = start + (end - start)/2;
		}
		if(c==0) {
			System.out.println("not found");
		}
	}
}
