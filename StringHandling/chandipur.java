package StringHandling;

public class chandipur {

	String fun(String str1, String str2, String str3) {
		String g = "";
		int i;
		
		int index = str1.indexOf(str2);
		
		for (i = 0; i < str1.length(); i++) {
			if (i == index) {      
				g = g + str3;           // jdo index == i ho jauga ta oh g vich str3 di value nu paa dega 
				i = i + str2.length(); // fr aglea nu skip krn lyi apa i nu str2 jinni length tk increment krwa dita. 
			}
  			g = g + str1.charAt(i);  // jinna chir index i de braabar a ta ona chir oh os nu as it is chepda rhe  
		}
		return g;
	}

	public static void main(String[] args) {

		String str1 = "Chandigarh University";
		String str2 = "garh";
		String str3 = "pur";
		
		chandipur obj = new chandipur();
		String ans= obj.fun(str1 ,str2,str3);
		System.out.println(ans);
		
		
		/*
		 * String ans = str1.replace(str2, str3);
		 *  System.out.println(ans);
		 *   int index =str1.indexOf(str2);
		 *    System.out.println("Index" + index);
		 */
	}

}
