package Practice;

public class armstrong {

	public static void main(String []args)
	{
		
		int num = 153;
		int t = num;
		int c = 0;
		while(num > 0)
		{
			c++;
			num = num / 10;
		}
		
		int sum = 0;
		num = t;
		while(num > 0)
		{
			int r = num % 10;
			int pow = (int)Math.pow(r, c);
			sum = sum + pow;
			num = num / 10;
		}
		System.out.println(sum);
		
		if(sum == t)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
