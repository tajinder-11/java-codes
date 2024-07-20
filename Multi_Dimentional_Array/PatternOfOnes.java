package Multi_Dimentional_Array;

import java.util.Scanner;

public class PatternOfOnes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and Coloumns ");
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		int i, j;

		System.out.println("Enter the elements : ");

		for (i = 0; i < r; i++) {

			for (j = 0; j < c; j++) {

				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elements Are : ");
		for (i = 0; i < r; i++) {

			for (j = 0; j < c; j++) {

				if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
					System.out.print(arr[i][j]);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
