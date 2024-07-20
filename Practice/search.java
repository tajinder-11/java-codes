package Practice;

public class search {

	static int searchInsert(int []arr , int target)
	{
		int start = 0; int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = start + (end - start)/2;
			
			if(arr[mid]== target) {
				return mid;
			}
			else if(target > arr[mid])
			{
				start = end+ 1;
			}
			else if(target < arr[mid])
			{
				end = mid-1;
			}
		}
		return start;
	}
	public static void main(String[] args) {
		
		int [] arr = {1,3,5,6,7};
		
		int target = 2;
		
		int ans = searchInsert(arr,target);
		
		System.out.println(ans);

	}

}
