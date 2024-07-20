package OOPS;

public class Functions {
	
	void sun() {
		System.out.println("bye");
	}
	void fun()
	{
		System.out.println("hi");
		sun();          // a function can call any non static function directly
		               // we can not be able to create a function inside a function
	}

	public static void main(String[] args) {

    System.out.println("hello");
    
    Functions obj = new Functions ();
    
    obj.fun();
 

	}

}
