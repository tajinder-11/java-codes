package Loops;

public class Armstrong2 {

	public static void main(String[] args) {
		
		 int num = 153;
		 int c =0;
		 int t = num;
         
		 
		 while (num >0 ) {  // number di ginti krda eh ta ki pta challe power kinni rkhni a 
			 c++;
			num = num/10;
		 }
		 
		 num = t;
		 int sum = 0;
		 
		 while(num > 0) { // hr ik no di power implement krk fr ohna nu add krn lai 
			 
		 int r = num % 10;
		 sum = sum + (int)Math.pow(r,c);
		 num = num / 10;
		 }
		 
		 if(t== sum ) {
			 System.out.println("armstrong");
		 }
		 else{
			 System.out.println("not armstrong");
		 }
		 
	}
	

}
