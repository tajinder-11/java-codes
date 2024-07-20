package TajinderSingh;

/*
days      fine per days

0-5       1 rs per day
5-10      2 rs per day
10-15     5 rs per day
above 15  10 rs per day

*/
public class Library {

	public static void main(String[] args) {
		
		int days = 17;
		int fine = 0;
		
		if(days > 0 && days <= 5) 
		{
			fine = days *1;
		}
		if(days > 5 && days <= 10) //6 7 8 9 10
		{
			fine = 5 + (days -5) * 2;
		}
		if(days > 10 && days <=15) //11 12 13 14 15     5 5 2
		{
			fine = 5 + 10  + (days - 10) *5;
		}
		if(days > 15) //17    5 5 5 2
		{
			fine = 5 + 10 + 25 + (days-15)* 10;
		}
		
		System.out.println("Total fine : " + fine);
		
	}

}
