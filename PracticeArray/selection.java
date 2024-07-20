package PracticeArray;

public class selection {

	public static void main(String[] args) {
		
		int [] arr = {4,2,5,3,1,7,6};
		
		for(int i = 0; i < arr.length; i++)
		{
			int min = i;
			
			for(int j = i + 1; j < arr.length; j++)
			{
				
				if(arr[min] > arr[j])
				{
					min = j;
				}
				if(i != min)
				{
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
