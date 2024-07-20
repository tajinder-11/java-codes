package StringHandling;

public class multiWordString {

	String fun(String str) {
		String arr[] = str.split(" ");

		int i, j;
		String g = " ";

		for(i = 0; i < arr.length; i++) {
			
			String s = arr[i];
			for (j = s.length()-1; j >= 0; j--) {
				g = g + s.charAt(j);
			}
			g = g + " ";
		}
		return g.trim();
	}

	public static void main(String[] args) {

		String str = "hello how are you";

		multiWordString obj = new multiWordString();
		String ans = obj.fun(str);
		System.out.println(ans);

//	    String []arr = str.split(" ");    // used to split the words of the array on the basis of space.
//	    
//	    for(int i = 0; i < arr.length;i++)
//	    {
//	    	String s = arr[i];
//	    	
//	    	for(int j = s.length()-1; j > 0; j--)
//	    	{
//	    		System.out.print(s.charAt(j));
//	    	}
//	    	
//	    }
	}

}
