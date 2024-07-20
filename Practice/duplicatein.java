package Practice;

public class duplicatein {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2};
		
		int [] brr = new int[arr.length];
		
		
		int i, k = 0;
		int c = 1;
		
		for(i = 0; i < arr.length-1; i++)
		{
			if(arr[i]== arr[i+1])
			{
				c++;
			}
			if(arr[i] != arr[i+1])
			{
				brr[k] = arr[i];
				k++;
			}
		}
		
		brr[k] = arr[i];
		k++;
		for(i = 0; i< k;i++)
		{
			System.out.println(brr[i]);
		}

	}

}
