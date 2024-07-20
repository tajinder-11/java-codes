package Practice;

import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		
		int[]arr = {2,3,2,2,5,6,3,2,2,3};
		          //2,2,2,2,2,3,3,3,5,6
		Arrays.sort(arr);
		int i;
		int c = 1;
		
		for(i = 0; i < arr.length-1; i++) 
		{
			if(arr[i] == arr[i+1])
			{
				c++;
			}
			
			else if(arr[i] != arr[i+1])
			{
				System.out.println(arr[i] + " comes " + c + " times");
				c=1;    //
			}
		}
		System.out.println(arr[i] + " comes " + c + " times");

	}

}
