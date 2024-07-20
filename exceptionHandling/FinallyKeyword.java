package exceptionHandling;
// Finally keyword = whether the exception raise or not finally block will always execute.
// Finally block es li bnaya jaanda a kyunki ho skda a catch vich koi problem aa jaye.
// Finally block is used to close the resources we have opened. 

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try
		{
			int a = 10;
			int b = 0;
			int c = a / b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally   //Exception aayea ya na aaye finally block hmesha i challuga.
		{
			System.out.println("I am in finally");
		}
		System.out.println("Main yaha bhi pahunch gya");

	}

}
