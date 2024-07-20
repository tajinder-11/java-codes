package DualLoop;

public class FactorialInRange {

	public static void main(String[] args) {
		
		int num,i;
	
		for(num=3;num<=7;num++) {
			
			int f =1; // f ko andar declare krna hai kyunki f ki value ko baar baar recenter krna hai
			          // agar aisa nhi kiya toh pehle no ko hi calculate krk print krna hai 
			
		for(i=num;i>0;i--) {
			
			f = i * f;
			
		}
		System.out.println(f);
		}
		

	}

}
