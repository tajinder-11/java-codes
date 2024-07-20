package PracticeArray;

public class Bubble {

	public static void main(String[] args) {
		
		
		int [] arr = {12, 5, 6, 7, 18, 23, 2};
		int i, j;
		
		for(i = 0; i < arr.length -1; i++)
		{
			
			for(j = 0; j < arr.length -1; j++)
			{
				
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
		for(i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
