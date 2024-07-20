package StringHandling;

// program to change lower case to upper case and upper case to lower case.

public class lowertoupperviceversa {
	
	String fun(String str)
	{
		int i;
		String s = "";
		
		for(i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);         // char ch kalla kalla character nu catch krn lyi lgaya a.

			if (ch >= 65 && ch <= 90) {
				ch = (char)(ch + 32);
			} 
			else if(ch >= 97 && ch <= 122) {
				ch = (char)(ch - 32);
			}
		     s = s + ch;      // kalle kalle characters nu ik string bnaun lyi.
		}
		return s;
	}

	public static void main(String[] args) {
		
		String str = "He&l%L$O";
		
		lowertoupperviceversa obj = new lowertoupperviceversa();
		String ans = obj.fun(str);
		System.out.println(ans);

	}

}
