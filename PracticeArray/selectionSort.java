package PracticeArray;

public class selectionSort {

	public static void main(String[] args) {
		
		int [] arr = {4,3,1,6,7,5,2};
		
		for(int i = 0; i < arr.length; i++)
		{
			
			int min = i;
			
			for(int j = i+1; j <arr.length; j++)
			{
				if(arr[min] > arr[j])
				{
					min = j;
				}
			}
			if(i != min)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
