package Practice;

public class vowels {

	int vowels(String str)
	{
		int i; 
		int c = 0;
		
		for(i = 0 ; i < str.length(); i ++)
		{
			char ch = str.charAt(i);
			
			if( ch == 'a' ||  ch =='e' || ch == 'i' || ch == 'o' || ch =='u')
			{
			c++;	
			}
			if( ch == 'A' ||  ch =='E' || ch == 'I' || ch == 'O' || ch =='U')
			{
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		vowels obj = new vowels();
		int ans = obj.vowels(str);
		System.out.println(ans);

	}

}
