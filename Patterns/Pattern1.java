package Patterns;

/*
  
  *
  **
  ***
  ****
  *****
  
 */
public class Pattern1 {

	public static void main(String[] args) {

		
		for (int i = 0; i < 5; i++) { // for rows

			for (int j = i; j >= 0; j--) { // for printing

				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
