package Recursion;

public class Power {

	int fun(int a , int b)
	{
		if(b == 0)
		{
			return 1;
		}
		else
		{
			return a * fun(a , b-1);      //b-1 used to decrrease the value of b everytime.
		}
	}
	
	public static void main(String[] args) {
		
	int a = 2;
	int b = 5;
	
	Power obj = new Power();
    int ans = obj.fun(a ,b);
    System.out.println(ans);
	}

}
