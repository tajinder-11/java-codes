package StringHandling;

// Program to find how much pallindrome words are there in a multiword string.

public class palindromeinmultiword 
{

	int fun(String str)
	{

		String[] arr = str.split(" ");  // sb ton pehla string nu space de base te split kr k ik array ch pa ta.
		
		int i, j, c = 0;

		for (i = 0; i < arr.length; i++) 
		{
			String s = arr[i];   // araay de hrek index te pye word nu s naam de variable ch paaya.
			String g = "";      // khaali string.

			for (j = s.length()-1; j >= 0; j--)  // te jehda word array de index te pya a ohnu reverse krn lyi loop
			{ 
				g = g + s.charAt(j); // fr ohnu ik thos word bnaun li formula.
			}
			if (s.equals(g))  // fr checking krni ki (s = g) de equal hai ya nhi je eqal haige a dono words ta
			{                //  count nu ++ kr dena a.		  
				c++;
			}
		}
		return c;
	}

	public static void main(String[] args)
	{
		String str = "mom and dad is my Friend";
		palindromeinmultiword obj = new palindromeinmultiword();
		int ans = obj.fun(str);
		System.out.println(ans);

	}

}
