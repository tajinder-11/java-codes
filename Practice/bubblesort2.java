package Practice;

public class bubblesort2 {

	public static void main(String[] args) {
		
		int [] arr = {12, 53, 32,43,22,15};
		
		int i , j;
		
		for( i = 0; i < arr.length; i++)
		{
			
			for(j = 0; j< arr.length-1;j++)
			{
				
				if(arr[j] > arr[j+1])
				{
					int t = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = t;
				}
			}
		}
         for(i = 0; i < arr.length;i++)
         {
        	 System.out.print(arr[i]+ " ");
         }
	}

}
