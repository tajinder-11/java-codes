package Arrays;

// 11 22 33 44 55 
// 55 11 22 33 44
public class Rotation2 {

	public static void main(String[] args) {

		int[] arr = { 11, 22, 33, 44, 55 };
		           // 55, 11, 22, 33, 44
		
		int t = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {  // jdo arr.length-1 ton start krna a ta i < 0 honi chahidi a.
													// kyunki apa 1st index te reh k i os element nu khich laina a.
			arr[i + 1] = arr[i];
		}
		arr[0] = t;

		System.out.println("After rotation : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
