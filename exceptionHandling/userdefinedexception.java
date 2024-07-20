package exceptionHandling;

import java.util.Scanner;

public class userdefinedexception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
     try
     {
    	System.out.println("enter two numbers");
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = a / b;
    	
    	if(c <= 0)
    	{
    		throw new Exception("Eh ta fr naa vechan walia galla a.");
        }
     }
     catch(Exception e)
     {
    	 System.out.println(e.getMessage());
     }

	}

}
