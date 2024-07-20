package INHERITANCESTUDENTMNGT;

public class Calculate extends Marks{

	int total;
	String status;
	
	void calc()
	{   //setDetails();
		//setMarks();
		this.total = m1 + m2;
		
		if(total >= 60) {
			status = "Pass";
		}
		else
		{
			status = "fail";
		}
	}
	void show()
	{
		//getDetails();
		//getMarks();
		System.out.println(total + "\t" + status + "\t");
	
	}
}
