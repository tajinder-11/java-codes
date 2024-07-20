package StringHandling;
// Converting a String into Uppercase letters 

// Java String is immutable which means it can not be modified 
// so if we have to make any modifications in string so we have 
// to store that particular method in another varuiable with data types.

public class test3 {

	public static void main(String[] args) {

		String str = "hello";
		str = str.toUpperCase();
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
	}
}
