package OOPS;

//Abstract Class : it is a class which contains both defined and undefined functions 

abstract class xyz  // aah abstract class a.
{
	void fun() 
	{
		System.out.println("hello Are you there?");
	}
	abstract void sun();  // ah abstract function a.
	                      // abstract function undefined hunda a mtlb k ehde andar apa kuj define ni krde
}

public class AbstractClass extends xyz 
{

	void sun()         // aah abstract class di implementation apa ethe ditti hoi a.
	{                  // is class ne abstract method ali class nu extend krea a.
		System.out.println("hi! i am here,come inside.");
	}
	public static void main(String[] args) 
	{
		// we can not make object of an abstract class
		// Because it is an incomplete class,it contains undefined functions 
		// and objects of incomplete classes can never be made 
		
		 AbstractClass obj = new AbstractClass();
		 obj.fun();
		 obj.sun();	
	}
}
