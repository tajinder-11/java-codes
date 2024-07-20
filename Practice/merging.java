package Practice;

public class merging {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		int []brr = {6,7,8,9};
		int []crr = new int[arr.length + brr.length];
		
		for(int i = 0; i < arr.length; i++)
		{
			crr[i] = arr[i];
			
		}
		for(int i = 0; i < brr.length; i++)
		{
			crr[arr.length+i] = brr[i];
		}
		
		System.out.println("after printing: ");
		
		for(int i = 0; i < crr.length; i++)
		{
			System.out.print(crr[i] + " ");
		}

	}

}
