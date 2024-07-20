package exceptionHandling;

public class exception {

	public static void main(String[] args) {
	
		try     // problematic situations nu hmesha try catch ch rakhida hunda a.
		{
			int a = 10;
			int b = 5;
			int c = a / b;
			System.out.println(c);
			int [] arr = {11,22,33,44};
			System.out.println(arr[0]);
			System.out.println(arr[4]);
		}
		catch(Exception e)    // catch block catches every type of exception.
		{
			System.out.println(e);
		}
	}

}
