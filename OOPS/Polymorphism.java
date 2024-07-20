package OOPS;
//POLYMORPHISM : Same name many forms

// 2 types : 1:) Static(compile time)      (function overloading)
//           2:) dynamic(run time)         (function overriding)

// FUNCTION OVERLOADING : When within a class we have more than one function but all must have different arguments 

public class Polymorphism {

	void fun()
	{
		System.out.println("hello");
	}
	void fun(int x)
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {

    Polymorphism obj = new Polymorphism();
    
    obj.fun();
    obj.fun(9);
	}

}
