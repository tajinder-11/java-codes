package PracticeArray;

import java.util.Arrays;

public class FrequencyinArray {

	public static void main(String[] args) {
	
		int [] arr = { 4,2,5,4,2,3,3,7,1,9,8};
		
		Arrays.sort(arr);
		int i;
		
		int c = 1;
		for(i = 0 ; i < arr.length -1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				c++;
			}
			if(arr[i] != arr[i+1])
			{
				System.out.println(i + "comes" + c + "times");
				c = 1;
			}
		}
		System.out.println(i + "comes" + c + "times");
	}

}
