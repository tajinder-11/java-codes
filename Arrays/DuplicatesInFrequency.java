package Arrays;

import java.util.Arrays;

// finding duplicates in array 

public class DuplicatesInFrequency 
{

	public static void main(String[] args) 
	{

		int[] arr = { 2, 6, 3, 2, 2, 3, 7, 4 };
		//            2, 2, 2, 3, 3, 4, 6, 7
		Arrays.sort(arr);
		
		int i;
		int c = 1;
		for (i = 0; i < arr.length - 1; i++) 
		{

			if (arr[i] == arr[i + 1]) 
			{
				c++;
			}
			if (arr[i] != arr[i + 1]) 
			{
				if (c > 1) {  //      jekar count > 1 hove it means oh element 1 ton jyada vaar aaya a so duplicate element mil jana a
					System.out.println(arr[i] + " comes" + c + " times");
				}
				c=1;
			}
		}
		if (c > 1)  // last wala element print kraun li because i arr.length-1 tk chalaya a so nhi ta index out of bound ho jana a.     
			        // jekar count > 1 hove it means oh element 1 ton jyada vaar aaya a so duplicate element mil jana a.
		{
			System.out.println(arr[i] + " comes" + c + " times");
		}


	}

}
