package Arrays;

public class Sum_of_elements {

	public static void main(String[] args)
	{

		int[] arr = { 1, 2, 3, 4, 5 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);

		// int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
	}
}
