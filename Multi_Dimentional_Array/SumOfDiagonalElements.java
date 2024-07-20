package Multi_Dimentional_Array;

//     0    1    2   
//0  a00  a01  a12
//1  a10  a11  a11
//2  a20  a21  a22


/* eh question haiga a g array de diagonal elements 
   nu add krn vaaste. Bs if ali condition lgni a 
   jekar array de i and j same hon ta add kr dye  ohna elements nu 
*/

import java.util.Scanner;

public class SumOfDiagonalElements 
{

	public static void main(String[] args)
	{
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Coloumns ");
		int r = sc.nextInt();
		int c = sc.nextInt();
         
		if(r==c)
		{
			
			int[][] arr = new int[r][c];
			int i, j, sum = 0;

			System.out.println("Enter the elements : ");

			for (i = 0; i < r; i++)
			{
				for (j = 0; j < c; j++)
				{
					arr[i][j] = sc.nextInt();
					
					if ( i+j ==2 || i ==j) {
						sum = sum + arr[i][j];
					}
					
				}
			}
			System.out.println("The sum of diagonal elements are : ");
			System.out.println(sum);
		}
		else
		{
			System.out.println("Not square : ");
		}
	
	}

}
