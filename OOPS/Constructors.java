package OOPS;
// constructor = it is a function whose name is same as that of class name.

// it does not have any return type, not even a void
// they are called automatically, whenever we create an object

public class Constructors
{

	Constructors()                 // Default constructors
	{
		System.out.println("hello");
	}

	Constructors(int x)             // parameterized constructors
	{         

		System.out.println("x = " + x);
	}

	public static void main(String[] args) {

		Constructors obj = new Constructors();
		Constructors obj1 = new Constructors(89);

	}

}
