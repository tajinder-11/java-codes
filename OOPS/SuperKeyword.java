package OOPS;
// super keyword is used to access the properties of the super class.
class df
{
	void fun() {
		System.out.println("hello");
	}
}
public class SuperKeyword extends df{

	void fun() {
		super.fun();
		System.out.println("hi");
	}
	public static void main(String[]args) {
		SuperKeyword obj = new SuperKeyword();
		obj.fun();
	}
}
