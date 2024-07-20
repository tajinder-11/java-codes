package Multi_Dimentional_Array;

import java.util.Scanner;

public class MinInRows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements : ");

		int r = sc.nextInt();
		int c = sc.nextInt();
		int i, j;
		int[][] arr = new int[r][c];

		System.out.println("Enter the elements : ");

		for (i = 0; i < r; i++) {

			for (j = 0; j < c; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements are : ");
		for (i = 0; i < r; i++) {

			int min= arr[i][0] ;

			for (j = 0; j < c; j++) {
               
				if(min > arr[i][j]) {
					 min = arr[i][j];
				}
			}
			System.out.println(min);
			
		}


	}

}
