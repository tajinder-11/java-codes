package OOPS;
 
public class CallByRefrence {

	void fun(int[]arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = arr[i] * 2;
		}
	}

	public static void main(String[] args) {

         int [] arr = {11,22,33,44};    
         CallByRefrence obj = new CallByRefrence();
         obj.fun(arr);
         
         for(int i=0;i<arr.length;i++)
         { 
        	 System.out.println(arr[i]);
         }

	}

}
