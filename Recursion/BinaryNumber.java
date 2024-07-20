package Recursion;
// program to make binary of a number.

/*
   25 % 2 = 12 , rem = 1
   12 % 2 = 6  , rem = 0
   6  % 2 = 3  , rem = 0
   3  % 2 = 2   , rem = 1 
   

*/
public class BinaryNumber {
     
	int sum = 0;
	int fun(int num)
	{
		
		if(num ==0)
		{
			return 0;
		}
		else
		{
			int r = num % 2;
			fun(num / 2);   // to get the digit present at the remainder.
			sum = sum * 10 + r;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int num = 25;
		BinaryNumber obj = new BinaryNumber();
		int ans = obj.fun(num);
        System.out.println(ans);
	}

}
