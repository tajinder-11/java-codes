package OOPS;

class abc
{
	static void sun()
	{
		System.out.println("hii");
	}
}


public class StaticFunction {
	
	
	static void fun()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		StaticFunction.fun();     // static function called by using it's class's name 
        abc.sun();
	}

}
