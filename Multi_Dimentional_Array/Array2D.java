package Multi_Dimentional_Array;

//      0    1    2
//  0  a00  a01  a12
//  1  a10  a11  a11
//  2  a20  a21  a22

import java.util.Scanner;
/*
 eh 2d array bnaun di technique a like apa simple array 
 bnaunde hunde c bs little bit changes ne.
 Eh haiga a user ton input lai k 2d array bnauna.
 
 */
public class Array2D {     // 2d array is basically a matrix 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Coloumns ");
		int row = sc.nextInt();            // taking rows from user         
		int col = sc.nextInt();            // taking coloumns from user 

		int[][] arr = new int[row][col];     // syantax of making a 2d array 
		int i, j, sum = 0;

		System.out.println("Enter the elements : ");  /*ehde ch elements enter kron lyi
		                                                dual loop da use hunda a.
		                                              */

		for (i = 0; i < row; i++) {            // first loop for rows 

			for (j = 0; j < col; j++) {        // 2nd loop for coloumns 

				arr[i][j] = sc.nextInt();

			}
		}
		System.out.println("Elements Are : ");     // similar dual loops for printing
		for (i = 0; i < row; i++) {

			for (j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
