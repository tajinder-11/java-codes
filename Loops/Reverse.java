package Loops;

// 1234 : 4321

public class Reverse {

	public static void main(String[] args) {
		
		int num = 1234;
		
		int sum = 0;
		
		while(num > 0) {
			
		    int r = num % 10;            //number da last digit lain lyi esnu 10 naal mod kitta 
			num = num / 10;             //number nu shota krn lyi num nu 10 naal divide krna 
			sum = sum * 10 + r;        //jo v saade output number aauge ohna nu ik thos number bnona 
			
		}
		
		System.out.print("Sum : " + sum);	
		
	}

}
