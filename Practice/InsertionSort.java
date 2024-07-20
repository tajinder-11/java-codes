package Practice;

public class InsertionSort {

	public static void main(String[] args) {
		
		int [] arr = { 5,3,7,2,1,4};
		
		int i;
		
		for(i=1;i<arr.length;i++) {
			
			int key = arr[i];
			int j = i-1;
			
			while(j >=0 && key < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;   
		}
		System.out.println("After Sorting : ");
		
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
