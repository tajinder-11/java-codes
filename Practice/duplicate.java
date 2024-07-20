package Practice;

import java.util.Arrays;

public class duplicate {

	public static void main(String[] args) {
		
		int []arr = {2,5,2,6,3,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,3,1};
		
		Arrays.sort(arr);
		
		int i, c = 1;
		for(i = 0; i< arr.length-1;i++)
		{
			if(arr[i]==arr[i+1]) {
				
				c++;
			}
			if(arr[i] != arr[i+1])
			{
				if(c>1)
				{
					System.out.println(arr[i] + " comes " + c + " times ");
				}
				c=1;
			}
			
		}
		if(c>1)
		{
			System.out.println(arr[i] + " comes " + c + " times ");
		}

	}

}
