package StringHandling;

public class palindrome {

	public static void main(String[] args) {


		String a = "mom";
		String b = "";
		
		System.out.println(a.length());
		
		//int n = a.length();
		
		for(int i = a.length() - 1; i >= 0; i--)
		{
			b = b + a.charAt(i);
		}
		
		if(a.equals(b))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("not palindrome");
		}

	}

}
