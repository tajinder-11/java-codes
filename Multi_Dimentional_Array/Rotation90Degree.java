package Multi_Dimentional_Array;

import java.util.Scanner;

/*
    1  2  3             7  4  1
    4  5  6             8  5  2
    7  8  9             9  6  3                                                                                                     3  
  
 
 */
public class Rotation90Degree {

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

		System.out.println("Result is : ");
		for (i = 0; i < r; i++) {

			for (j = c - 1; j >= 0; j--) {

				System.out.print(arr[j][i] + " ");

			}
			System.out.println();
		}

	}

}
