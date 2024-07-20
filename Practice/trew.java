package Practice;

import java.util.Arrays;

public class trew {

	public static void main(String[] args) {
		
		int[]arr = {2,3,4,2,6,7,2,3};
		
		Arrays.sort(arr);
		
		int[] brr = new int[arr.length];
		int c = 1 , k = 0 , i;
		for(i = 0 ; i < arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				c++;
			}
			if(arr[i] != arr[i+1])
			{
				brr[k] = arr[i];
				k++;
				//c=1;
			}
		}
		brr[k] = arr[i];
		k++;

		
		System.out.println("after removing: ");
		
		for(i = 0 ; i < k;i++)
		{
			System.out.print(brr[i] + " ");
		}
	}

}
