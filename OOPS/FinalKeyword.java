package OOPS;
// final keyword :
// final variable : Constant
// final function : final function can not be overridden
// final class : final class can not be inherited

final class jj
{
    void fun()
    {
    	System.out.println("hello");
    }
}

public class FinalKeyword {  //extends jj{

	void fun()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		
		final int a = 10;
		// a = 90;
		System.out.println(a);
        
	}

}
