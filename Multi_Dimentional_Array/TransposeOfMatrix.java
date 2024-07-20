package Multi_Dimentional_Array;

import java.util.Scanner;
/*
 Given matrix         transpose 
 
  1 2 3                1 4 7                 
  4 5 6                2 5 8   
  7 8 9                3 6 9
 
 */
public class TransposeOfMatrix {

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

				System.out.print(arr[j][i] + " ");

			}
			System.out.println();
		}
	}

}
