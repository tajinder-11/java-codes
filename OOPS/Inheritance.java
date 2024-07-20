package OOPS;

// single level inheritance

class AA {
	
	void fun()
	{
		System.out.println("hello");
	}
}
public class Inheritance extends AA
{
	
	void sun()
	{
		System.out.println("hi");
	}

	public static void main(String[] args)
	{
      
		Inheritance obj = new Inheritance();
		obj.fun();
		obj.sun();
	}

}
