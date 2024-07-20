package INHERITANCESTUDENTMNGT;
import java.util.Scanner;
public class StuDetails {
	
	
	int id ;
	String name;
	Scanner sc;
	
    void setDetails()
    {
    	sc = new Scanner (System.in);
    	System.out.println("Enter the id and name : ");
    	this.id = sc.nextInt();
    	this.name = sc.next();
    }
    void getDetails()
    {
     System.out.print(id + "\t" + name + "\t");
    }
	

}
