package PracticeArray;

public class MergingArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int [] brr = {6,7,8,9};
		int [] crr = new int[arr.length + brr.length];
		int i;
		
		for( i = 0; i < arr.length; i++)
		{
			crr[i] = arr[i];
		}
		for( i = 0; i < brr.length; i++)
		{
			crr[arr.length + i] = brr[i];
		}
		
		for( i = 0; i < crr.length; i++)
		{
			System.out.println(crr[i]);
		}

	}

}
