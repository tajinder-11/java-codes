package Practice;

public class armstrng {

	public static void main(String[] args) 
	{
		
		int num = 153;
		int t = num;
		int c = 0;
		
		while(num > 0)
		{
			c++;
			num = num / 10;
		}
		
		num = t;
		int sum = 0;
		while(num > 0)
		{
			int r = num % 10;
			int power = (int)Math.pow(r, c);
			sum = sum + power;
			num = num / 10;
		}
		
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
