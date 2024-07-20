package Arrays;

public class MergingArrayInOneLoop {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] brr = { 6, 7, 8, 9 };
		int[] crr = new int[arr.length + brr.length];
		int j=0;
		
		for (int i = 0; i < crr.length; i++) {
           
			if(i < arr.length) {
			crr[i] = arr[i];
			}
			else{
				crr[i] = brr[j++];
			}
		}
		System.out.println("After Sorting :");
		for(int i=0;i < crr.length;i++) {
			System.out.print(crr[i] + " ");
		}

	}

}
