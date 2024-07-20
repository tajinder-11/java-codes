package Practice;

import java.util.Scanner;

public class deleteelement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		int i;
		int [] arr = new int[size];
		System.out.println("Enter the elements: ");
		
	 for(i = 0; i < size ; i++)
	 {
		 arr[i]  = sc.nextInt();
	 }
	 
	 System.out.println("enter the position from where u want to delete an element: ");
	 int pos = sc.nextInt();
	 
	 for(i = pos; i < arr.length-1;i++)
	 {
		 arr[i] = arr[i+1];
	 }
	 
	 System.out.println("after deletion: ");
	 for(i = 0; i< arr.length -1 ;i++)
	 {
		 System.out.println(arr[i]);
	 }

	}

}
