package Practice;

public class yskh {

	public static void main(String[] args) {

		String str = "HeLlo";
		
		for(int i = 0; i < str.length();i++)
			
		{
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 97)
			{
		         ch = (char)(ch + 32);
			}
			else if (ch >= 99 && ch <= 122)
			{
				ch = (char)(ch - 32);
			}
			System.out.println(ch);
		}
		

	}

}
