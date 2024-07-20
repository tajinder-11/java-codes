package OOPS;

public class CallByValue {

	int fun(int x) {
		int f = 1, i;
		
		for(i=x; i > 0;i--) {
			
			f = f * i;
		}
		return f;
	}
	public static void main(String[] args) {
      
		CallByValue obj = new CallByValue();
		int ans = obj.fun(5);
		System.out.println("Answer is : " + ans);
		
	}

}
