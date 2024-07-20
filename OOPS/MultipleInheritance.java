package OOPS;

class Do{
	
	private int a;
	public int b;
	
	void fun()
	{
		a = 10;  b = 20;
	}
	int geta()
	{
		return a;
	}
}

class EE extends Do
{
	
	private int c;
	void multiply()
	{
		c = geta() * b;
	}
	
	void display()
	{
		System.out.println("a = " + geta());
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {

		EE obj = new EE();
		
		obj.fun();
		obj.multiply();
		obj.display();  // ehne 200 ans dena coz 10 * 20 = 200
		
		obj.b = 40;     // b di value updated te 400 ans because 10 * 40 = 400
		obj.multiply();
		obj.display();

		
	}

}
