package Arrays;

public class Question {

	public static void main(String[] args) {
		
		int [] arr = {2,5,7,0,4,0,7,-5,8,0};   // output = 2,5,7,8,4,-5,7,0,0,0
		
		int i;
		int t=arr[3];
		arr[3]=arr[8];
		arr[8]=t;
		t=arr[5];
		arr[5]=arr[7];
		arr[7]=t;
		for(i = 0; i< arr.length;i++)
		{
		System.out.print(arr[i]); 	
		}
		
	}

}
