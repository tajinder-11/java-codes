package Patterns;

/*
  
        *
       ** 
      ***  
     ****
    *****   
 */
public class Pattern5 {

	public static void main(String[] args) {
		
		for(int i = 0; i <5 ; i++) {
			
			for(int k = 0; k < 5 - i; k ++ ) {
				
				System.out.print(" ");
			}
			for(int j = i; j >=0; j--){
				
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		

	}

}
