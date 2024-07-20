package StringHandling;

// program to find number of vowels in a string

public class findingvowelsinstring {
	
	int fun(String str)
	{
		int i, c = 0 ,c1= 0;
		for(i = 0 ;i < str.length();i++)	
		{
			char ch = str.charAt(i);
			
			if(ch=='a'  || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
			{
			   c++;
			}
			else if( ch == 'A' || ch == 'E' ||ch == 'I' || ch == 'O' || ch == 'U')
			{
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		
		String str = "Hello";
		findingvowelsinstring obj = new findingvowelsinstring();
		int ans = obj.fun(str);
		System.out.println("answer = "+ans);
	}

}
