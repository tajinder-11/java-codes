package TajinderSingh;


public class Division {

	public static void main(String[] args) {
		
        
        double s1= 70 , s2 = 70 , s3= 70;

        double tot = s1+s2+s3;
        double per = (tot*100)/(500);

        System.out.println(" the total marks you get :-"+tot);
        System.out.println("the percentage is "+per);
        
        if(per>= 60) {
        	System.out.println("first division");
        }
        else if(per >= 50 && per < 60) {
        	System.out.println("second division");
        }
        else if(per >= 40 && per < 50) {
        	System.out.println("third division");
        }
        else if(per < 40) {
        	System.out.println("fail");
        }
	}

}
