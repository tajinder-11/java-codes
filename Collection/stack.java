package Collection;

import java.util.Stack;

public class stack
{

	public static void main(String[] args)
	{	
		Stack<Integer> stk = new Stack<>();
		stk.push(33);
		stk.push(22);
		stk.push(99);
		stk.push(55);
		
		int x = stk.pop();
		
		System.out.println("popped element " + x);
		
		
		int p = stk.peek();
		System.out.println("peek element " + p);
		
	}

}