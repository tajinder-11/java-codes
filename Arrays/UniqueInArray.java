package Arrays;

public class UniqueInArray
{

	public static void main(String[] args) 
	{
		
		int [] arr = {2,6,3,2,3,7,4};
		int i,j;
		
		for(i=0;i<arr.length;i++) 
		{
			int c=0;
			for(j=0;j<arr.length;j++) 
			{
				
				if(arr[i]==arr[j]) 
				{
					c++;
				}
			}
			if(c==1) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
