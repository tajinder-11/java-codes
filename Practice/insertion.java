package Practice;

public class insertion {

	public static void main(String[] args) {
		
		int [] arr = { 12, 22, 11,17,14,25};
		
		for(int i = 1; i < arr.length; i++)
		{
			
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && key < arr[j])
			{
				arr[j+1] = arr[j];
				j = j - 1;
			} 
			arr[j+1] = key;
		}
		
		System.out.println("after sorting: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
