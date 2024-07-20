package StringHandling;
// String handling
public class StringLength {

	public static void main(String[] args) {
		
		String str = "hello";
		//System.out.println(str);
		System.out.println("Length = "+str.length());
		
		int i;
		for(i = 0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}

}
