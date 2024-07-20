package Arrays;

// 2 array nu merg krk 3rd array ch lai k auna a 
public class MergingArray {

	public static void main(String[] args) {
		
		int [] arr = {5,8,3,2,6};
		int [] brr = {7,1,4};
		int [] crr = new int[arr.length+ brr.length];
		int i;
		
		for(i=0;i<arr.length;i++) 
		{
		  crr[i]= arr[i];
		}
		for(i=0;i<brr.length;i++)
		{
			crr[arr.length+i] = brr[i];
		}

		for(i=0;i<crr.length;i++) 
		{
			System.out.println(crr[i]);
		}
	}

}
