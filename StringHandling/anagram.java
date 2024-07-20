package StringHandling;

import java.util.Arrays;

// anagram String = if two strings uses same characters then both strings are anagram to each other.

public class anagram {

	boolean fun(String str1, String str2) {
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		char[] arr1 = str1.toCharArray(); // String nu character array ch convert krn da function.
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1); // fr ohna arrays nu sort krn da function.
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) // eh check krn lyi ki dono arrays equal hai ya nhi.
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		String str1 = "silent";
		String str2 = "listen";
		anagram obj = new anagram();

		if (obj.fun(str1, str2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}
/*
Array nu sort kar k dobara String ch convert kitta and fr ode te equals wala function lagaya.
diffrent method but same functioning. 
 
str1 = Strig.valueOf(arr1);
str2 = String.valueOf(arr2);
if(str1.equals(str2))
{
return true;
}
return false;
 
*/

//int i;
//for( i = 0 ; i < arr1.length ;i++) 
//{
//	System.out.print(arr1[i]);
//}
//System.out.println();
//
//for( i = 0 ; i < arr2.length ;i++) 
//{
//	System.out.print(arr1[i]);
//}
