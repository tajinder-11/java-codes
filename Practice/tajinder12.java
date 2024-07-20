package Practice;

public class tajinder12 {

	public static void main(String[] args) {
		
		
		int []arr = {11,22,33,44,55};
		
		int t = arr[arr.length-1];
		
		for(int i = arr.length-2; i>=0; i--)
		{
			arr[i+1] = arr[i];
		}
		arr[0] = t;
		
		System.out.println("After rotation: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
