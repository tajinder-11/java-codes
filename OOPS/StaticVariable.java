package OOPS;

// single memory shared between two objects

public class StaticVariable {

	static int a;

	void fun() {
		a = 10;
	}

	void dikhao() {
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {

		StaticVariable sv = new StaticVariable();
		StaticVariable sv1 = new StaticVariable();

		sv.fun();
		sv1.dikhao();

	}

}
