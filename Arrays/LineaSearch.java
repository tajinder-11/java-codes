package Arrays;

import java.util.Scanner;

public class LineaSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] arr = {13,2,54,17,22};

		System.out.println("Enter the element to be searched : ");
		int item = sc.nextInt();
		int c=0;

		for (int i = 0; i < arr.length; i++) {

			if (item == arr[i]) {
				c++;
				System.out.println("item found at index : " + i);
				break;
			}
		}

		if(c==0) {
			System.out.println("not found");
		}
	}

}
