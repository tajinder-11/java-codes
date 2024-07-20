package Practice;

public class linearsearch {

	static int linearsearch1(int[]arr, int target)
	{
		
		for(int i = 0; i < arr.length; i++)
		{
			
			int element = arr[i];
			
			if(element == target)
			{
				return i;
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {11,22,33,44,55,66,77,88,99};
		
		int target = 77;
		
		int ans = linearsearch1(arr, target);
		
		System.out.println(ans);

	}

}
