package Multi_Dimentional_Array;

import java.util.Scanner;

public class UlteDiagonal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and coloumns : ");

		int r = sc.nextInt();
		int c = sc.nextInt();
		int i, j, sum = 0;

		if (r == c) {

			int[][] arr = new int[r][c];

			System.out.println("Enter The Elements : ");
			for (i = 0; i < r; i++) {

				for (j = 0; j < c; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			System.out.println("Elements Are : ");

			for (i = 0; i < r; i++) {

				for (j = 0; j < c; j++) {

					if (i + j == r - 1) { // jihna elements da sum same aa jave
						sum = sum + arr[i][j]; // ohna te hi apa formula laa dena a te
												// saade ulte diagonal da sum haazir hai
					}
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		System.out.println("Your Sum is : " + sum);
	}

}
