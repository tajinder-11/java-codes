package Recursion;

// when a function calls itself again and again then it is called recursion

public class recursion {

	void fun(int num)
	{
		   if(num ==0)
		   {
			   return;
		   }
		   else
		   {
			   System.out.println(num);
			   fun(num -1);
		   }
	}
	
	void sun(int num)
	{
		if(num==0)
		{
			return;
		}
		else
		{
			sun(num-1);
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		
    int num = 3;
    recursion obj = new recursion();
    obj.fun(num);	
    obj.sun(num);
	}

}
