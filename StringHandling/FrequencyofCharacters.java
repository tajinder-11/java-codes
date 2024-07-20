package StringHandling;

// program to find the frequency of characters in a String

public class FrequencyofCharacters {

	public static void main(String[] args) 
	{

		String str = "aeroplane";
		int i;
		int[] arr = new int[123];
		
		for (i = 0; i < str.length(); i++) 
		{
			arr[str.charAt(i)]++;
		}
		for (i = 0; i < arr.length; i++) 
		{
			if (arr[i] != 0) {
				System.out.println((char) i + " comes " + arr[i] + " times");
			}
		}
	}
}
