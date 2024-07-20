 package Arrays;

// 11 22 33 44 55  -      item = 88 and position is 1
//  0  1  2  3  4  5
//
import java.util.Scanner;

public class InsertionInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size : ");
		int size = sc.nextInt();

		int[] arr = new int[size + 1];

		System.out.println("Enter the elements : ");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements to be inserted : ");
		int item = sc.nextInt();
		
		System.out.println("position : ");
		int pos = sc.nextInt();
		pos = pos-1;    /* eh es lyi laaya a kyunki user nu ni pta ki array 0th index ton start hunda os lyi oh hi first a.  
		                   so eh wala check value nu ik step ghta deuga ta ki sara kamm user de according hi krega */
		
		for(int i=size-1;i >= pos;i--){ 
		
			arr[i+1] = arr[i];  // jdo tk i position te ni pahunch janda td tk apa arr[i] nu arr[i+1] di jgah te liaunde rehna a.
			
		}
		arr[pos] = item; // desired position te apa new element nu paa ditta.
		System.out.println("After insertion : ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	
	}

}
