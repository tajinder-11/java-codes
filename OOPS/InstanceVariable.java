package OOPS;

import java.util.Scanner;

public class InstanceVariable {

	int id;               // Instance variable // class ka variable //Scope poori class ch hunda esda.
	String name;

	void fun()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id and name :");
		id = sc.nextInt();
		name = sc.next();
	}

	void show() 
	{

      System.out.println(id + " " + name);     
	}

	public static void main(String[] args) {

		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		obj1.fun();
		obj2.fun();
		obj1.show();
		obj2.show();
	}
}