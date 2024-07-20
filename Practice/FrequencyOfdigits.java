package Practice;

import java.util.Arrays;

public class FrequencyOfdigits {

	public static void main(String[] args) {

    int num = 592329;
    
    int [] arr = new int[10];
    int i;
    while(num > 0) {
    	
    	int r = num % 10;
    	arr[r]++;
    	num = num/10;
    	
    	
    }
    for(i=0;i<arr.length;i++) {
    	System.out.println(i + " comes " + arr[i] + " times ");
    }

	}

}
