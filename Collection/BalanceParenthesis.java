package Collection;

import java.util.Stack;

public class BalanceParenthesis {

	boolean fun(String str) {
		if (str.isEmpty()) {
			return true;
		}
		Stack<Character> stk = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stk.push(ch);
			}
			if (ch == ')' || ch == '}' || ch == ']')
			{
				if (stk.isEmpty()) {
					return false;
				}
				char top = stk.peek();
				if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[') {
					
					stk.pop();
				}
				else {
					
					return false;
				}
			}
		}
		return stk.isEmpty() ? true : false;
	}

	public static void main(String[] args) {

		String str = "({[()]})";

		BalanceParenthesis obj = new BalanceParenthesis();
		if(obj.fun(str))
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}

	}

}
