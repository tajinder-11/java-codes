package StringHandling;

// converting lower case to uppercase and uppercase to lowercase.

// ASCII 

//A = 65     a = 97
//B = 66     b = 98
//Z = 99     z = 122

public class lowertoupperASCII
{

	public static void main(String[] args)
	{

		String str = "HellO";

		int i;

		for (i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);

			if (ch >= 65 && ch <= 90)
			{
				ch = (char) (ch + 32);
			} 
			else 
			{
				ch = (char) (ch - 32);
			}
			System.out.println(ch);
		}

	}

}
