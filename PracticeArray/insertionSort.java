package PracticeArray;

public class insertionSort {

	public static void main(String[] args) {
		
		int arr[] = {3,1,5,2,4,7,6};
		
		int i;
		
		for(i = 1; i < arr.length; i++)
		{
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j--;
			}
		    arr[j+1] = key;
		}
		
		System.out.println("After sorting: ");
		for(i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
