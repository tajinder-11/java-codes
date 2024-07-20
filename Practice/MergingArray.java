package Practice;

public class MergingArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		int[] brr = {6,7,8,9};
		
		int []crr = new int[arr.length + brr.length];
		
		for(int i=0;i<arr.length;i++) {
			crr[i] = arr[i];     // arr de saare elements crr de pehle indexes te araam naal aa jaange. 
			
		}
		for(int i=0;i<brr.length;i++) { 
			crr[arr.length+i] = brr[i];   // but br de elements nu crr ch paaun lyi apa nu indexing di lod paini a. 
		}                                 // es krk apa ne brr de elements nu crr de length+1 ch suttna a. 
		
		System.out.println("After merging : ");
		
		for(int i=0;i<crr.length;i++) {
			System.out.print(crr[i] + " ");
		}
	}

}
