package OOPS;

// it contains all undefined functions,its constructor can not be made,thats why it takes less memory 
// the classes which inherits interface needs to define the undefined functions

interface cc 
{
	default void gun()      // if we want to make any defined functions,then default keyword is used.
	{
		
		int a = 10;
	}

	void fun(); // It is by default abstract function

	void sun();
}

class tej
{
	void meth()
	{
		System.out.println("i am tej class function");
	}
}

public class Interfaces extends tej implements cc {

	public void fun() {
		System.out.println("kidaa fer");
	}

	public void sun() {
		System.out.println("bs vdia tu sunaa");
	}

	public static void main(String[] args) {

		Interfaces obj = new Interfaces();
		obj.fun();
		obj.sun();
		obj.meth();

	}

}
