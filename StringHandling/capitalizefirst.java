package StringHandling;

//capitalize the first character of the world

public class capitalizefirst {

	String fun(String str)
	{
		String g = "";
		char first = str.charAt(0);
		
		if(first >=97 && first <= 122)
		{
			first = (char)(first - 32);
		}
		
		g = g + first +  str.substring(1, str.length());
		
		return g;
	}
	
	public static void main(String[] args) {
		
		String str = "hello";
		capitalizefirst obj = new capitalizefirst();
		String ans = obj.fun(str);
		System.out.println(ans); 
	}
}

/*
String str = "hello";
System.out.println(str.substring(1));
System.out.println(str.substring(3, str.length()));
*/