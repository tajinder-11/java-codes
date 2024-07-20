package Practice;

public class firstandlast {

	public static void main(String[]args)
	{
		
		int num = 1234;
		
		int last = num % 10;
		System.out.println(last);
		
		while(num >= 10)
		{
			num = num / 10;
		}
		int first = num;
		System.out.println(first);
	}
}
