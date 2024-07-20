package INHERITANCESTUDENTMNGT;

public class Marks extends StuDetails{

	int m1 , m2;
	
	void setMarks()
	{
		System.out.println("Enter the marks :");
		this.m1 = sc.nextInt();
		this.m2 = sc.nextInt();
		
	}
	void getMarks()
	{
		System.out.print(m1 + "\t" + m2 + "\t");
		
	}
}

