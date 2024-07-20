package PracticeArray;

import java.util.Scanner;

public class insertioninarray {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     int size = sc.nextInt();
     int [] arr  = new int[size + 1];
     
     for(int i = 0; i < size; i++)
     {
    	 arr[i] = sc.nextInt();
     }
     
     System.out.println("item u want to enter in array");
     int item = sc.nextInt();
     
     System.out.println("position at u want to enter the element");
     
     int pos = sc.nextInt();
     pos = pos - 1;
     
     for(int i = size-1; i >= pos; i--)
     {
    	 arr[i+1] = arr[i];
     }
     arr[pos] = item;
     
     System.out.println("after insertion");
     for(int i = 0; i < arr.length; i++)
     {
    	 System.out.println(arr[i]);
     }
	}

}
