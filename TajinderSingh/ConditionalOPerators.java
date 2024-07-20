package TajinderSingh;

public class ConditionalOPerators {

	public static void main(String[] args) {
		
		int a = 5, b = 9, c = 12 ;
//		
//		int ans = a>b ? a :b;
		
	    //int a = 5, b = 7, c = 9;
		
		int answer = a>b ? (a>c ? a:c) : (b>c ? b:c);
		
		System.out.println(answer);

	}

}
