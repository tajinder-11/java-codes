package Recursion;

//Fibonacchi series using recursion.
// 0 1 1 2 3 5 8 13....

public class Fibonacchi {

	int fun(int x)
	{
		
		if(x==0)
		{
			return 0;
		}
		else if(x==1)
		{
			return 1;
		}
		else
		{
            return fun(x-1)+ fun(x-2);  // x - 1 picks just recent value of the result because it backtracks to its previous result.
		}
	}
	
	public static void main(String[] args) {

    int i;
    Fibonacchi obj = new Fibonacchi();
    for(i = 0 ; i < 10 ; i++)    // for loop until 10 it will print first 10 fibonacchi numbers.
    {
    	int ans = obj.fun(i);                             
    	System.out.print(ans+ " ");
    }

	}

}
