package Practice;

import java.util.Arrays;

public class unique {

	public static void main(String[] args) {
		
		
		int[]arr = {3,4,2,4,3,6,5,5};
		
		Arrays.sort(arr);
		int c = 1,i;
		for( i = 0; i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				c++;
			}
			else if(arr[i] !=arr[i+1])
			{
				if(c==1)
				{
					System.out.println(arr[i] + " comes " + c+ " times");
				    
				}
				c=1;
			}
		}
        if(c==1)
        {
        	System.out.println(arr[i] + " comes " + c + " times ");
        }
	}

}
