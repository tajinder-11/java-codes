package Practice;

import java.util.Scanner;

public class insertanelementinarray {

	public static void main(String[] args) {
		
		System.out.println("enter the size: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int [] arr = new int[size + 1];
		int i;
		
		System.out.println("enter the elements: ");
		for(i = 0; i < size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the element you want to insert: ");
        int item = sc.nextInt();
        
        System.out.println("enter the position at which u want to insert the elements");
        int pos = sc.nextInt();
        pos = pos-1;
		
		for(i = size -1; i >= pos;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[pos] = item;
		
		System.out.println("after insertion: ");
		
		for(i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
