package Patterns;

/*
 
 *****
  ****
   ***
    **
     *
 */
public class Pattern7 {

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) {

			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = i; j > 0; j--) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
