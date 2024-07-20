package Practice;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = sc.nextInt();
		
		int[]arr = new int[size];
		
		System.out.println("enter the elements");
		
		for(int i = 0; i < arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("elements are ");
		
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 0; i < arr.length;i++)
        {
        	 if(arr[i] < min) {
             	min = arr[i];
             }
        	 if(arr[i] > max)
        	 {
        		 max = arr[i];
        	 }
        }
        System.out.println("min is : " + min);
        System.out.println("max is : " + max);
        
       
	}

}
