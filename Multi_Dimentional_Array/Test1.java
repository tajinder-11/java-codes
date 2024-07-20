package Multi_Dimentional_Array;
// given                      output to be generated 

//  1 2 3                           7 8 9
//  4 5 6                           4 5 6
//  7 8 9                           1 2 3

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Rows and Coloumns : ");

		int r = sc.nextInt();
		int c = sc.nextInt();
		int i, j;

		int[][] arr = new int[r][c];

		System.out.println("Enter the elements :");
		for (i = 0; i < r; i++) {

			for (j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements are : ");
		for (i = r - 1; i >= 0; i--) {

			for (j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
