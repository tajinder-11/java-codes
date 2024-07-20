package Practice;

public class bifric {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int [] even = new int[arr.length];
		int [] odd = new int[arr.length];
		
		int i, k = 0 , j = 0;
		
		
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				even[k] = arr[i];
				k++;
			}		
			if(arr[i] % 2 != 0)
			{
				odd[j] = arr[i];
				j++;
			}
		}
		
		System.out.println("even wale: ");
		for(i = 0; i < k; i++)
		{
			System.out.println(even[i]);
		}
		System.out.println("odd wale: ");
		for(i = 0; i < j; i++)
		{
			System.out.println(odd[i]);
		}

	}

}
