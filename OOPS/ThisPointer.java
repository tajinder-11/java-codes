package OOPS;
// this pointer points to s current class element 
// it is used to diffrentiate between local and instance 

public class ThisPointer {
	
	int a;
	
	void fun(int a)
	{
		this.a = a;      // this keyword tells us that it is a class variable, kyunki int a likhn naal oh a nu local hi samjhega 
	}
	void show()    // function to print value of variable present in function fun().
	{
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {
		
	ThisPointer obj = new ThisPointer();
	obj.fun(90);
	obj.show();

	}

}
