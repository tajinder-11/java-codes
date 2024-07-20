package AccessModifiers;

import AccessModifiers2.*;

public class Modifiers extends Modifiers1 {

	public static void main(String[] args) {

		Modifiers obj = new Modifiers();

	//	System.out.println(obj.a); // Default access modifiers can not be accessed outside package
		System.out.println(obj.b); // public access modifiers can be accessed anywhere
		System.out.println(obj.c); // protected access modifiers can be accessed outside package using inheritance

	}

}
