package OOPS;

// suppose we have 2 classes ,one inherits another,and both classes having same name function
// Then child class function always override the parent class function.

class ccdf {
	void fun() {
		System.out.println("hello");
	}
}

public class OverRiding extends ccdf {

	void fun() {
		System.out.println("hi");
	}

	public static void main(String[] args) {

		OverRiding obj = new OverRiding();
		obj.fun();
	}
}
