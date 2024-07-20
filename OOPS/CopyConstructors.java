package OOPS;

public class CopyConstructors {
	
	int a;
	
	void fun()
	{
	a = 10;
		
	}
	void show()
	{
		System.out.println(" a = " + a);
	}
	
	CopyConstructors(){}
	
	 CopyConstructors(CopyConstructors obj1)
	{
		a = obj1.a;
	}

	public static void main(String[] args) {
		
	CopyConstructors obj1 = new CopyConstructors();
	obj1.fun();
	CopyConstructors obj2 = new CopyConstructors(obj1);
	obj2.show();
	

	}

}
