package StringHandling;
// Given String = "ab3xymp2rjk" : output = abpk
public class Question2 {
//ehde vich apa ne identify krna ki koi digit ta ni a string ch, jinna number aya one i agle digits skip krwaune a then jithe a gya oh ala print krna.
	public static void main(String[] args) {
		
		String str = "ab3xymp2rjk";  // output = abpk
		Question2 obj = new Question2();
		
		int i, c = 0;
		String ans = "";
		for(i =0; i < str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 48 && ch<= 57) 
			{   
				int num = (ch- 48);
				i = i + num;
				continue;
			}
				ans = ans + ch;
		}	
		System.out.println(ans);
	}
}
