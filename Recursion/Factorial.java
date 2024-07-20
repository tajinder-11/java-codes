package Recursion;

public class Factorial {

	int fun(int num)
	{
		if(num <= 1)
		{
			return 1;
		}
		else
		{
			return num * fun(num -1);
		}
	}
	public static void main(String[] args) {
		
		int num = 5;
		Factorial obj = new Factorial();
		int ans = obj.fun(num);
		System.out.println(ans);

	}

}
