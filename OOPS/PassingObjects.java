package OOPS;

//  passing objects as an arguments 
//  t1 de smaan nu t2 ch add kr k t3 ch paauna a 
class timer 
{
	
	private int hr , min, sec;
	
	void fun(int h, int m ,int s) 
	{
		hr = h;  min = m; sec = s;
	}
	
	void show () 
	{
		System.out.println(hr + " : " + min+ " : " + sec);
	}
	timer sum (timer x)
	{
		timer obj = new timer();
		
		int m= (sec + x.sec) /60;
	    obj.sec = (sec + x.sec) % 60;
	    System.out.println("Seconds");
	    System.out.println(m);
	    System.out.println(obj.sec);
	     
	   
		int h =  (m + min + x.min)/60;
		obj.min = (m +min + x.min) % 60;   // first min = jehne call kittti te x.min ohda jo object pass krea hoea a 
		 System.out.println("minutes");
		 System.out.println(h);
		 System.out.println(obj.min);
		obj.hr = h + hr + x.hr;                    // first hr = jehne call kittti te x.hr ohda jo object pass krea hoea a 
       
		return obj;
	}
}

public class PassingObjects {

	public static void main(String[] args) {
   
		timer t1 = new timer();
		timer t2 = new timer();
		timer t3 = new timer();
		
		t1.fun(4, 50 ,35);
		t2.fun(5, 45, 40);
		t3 = t1.sum(t2);// t1 de naal call krni a te t2 nu pass krna a (vise versa)  and value t3 vich store kr ditti 
		t3.show();			
      
	}

}
