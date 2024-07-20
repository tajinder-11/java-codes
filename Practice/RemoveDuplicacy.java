package Practice;

import java.util.Arrays;

public class RemoveDuplicacy {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 3, 2, 2, 3, 7, 4 };
		int[] temp = new int[arr.length];
		
		Arrays.sort(arr);
		
		int i,k=0;
		int c=1;
		
		for(i=0;i<arr.length -1;i++) 
		{
			
			if(arr[i]==arr[i+1]) 
			{
				c++;
			}
			if(arr[i] != arr[i+1]) 
			{
			temp[k]=arr[i];
			k++;
			c=1;
			}
		}
		 temp[k]=arr[i];
		 k++;
		 
		 for(i=0;i<k;i++) {
			 System.out.println(temp[i]);
		 }
	}

}
