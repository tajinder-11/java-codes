package Arrays;

/* es question ch aapa oh wale elements de index nu print krna 
   a jihna de elements nu add krk target de equal aa jaye 
   
   for example = array [2,7,4,15]
   target =9
   
   (arr[0] =2  + arr[1] =7) = 9
   
   ans is [0,1]
     */
public class TwoSumProblem {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 2, 11, 15 };

		int target = 9, i, j;

		for (i = 0; i < nums.length; i++) {

			for (j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
                    
					 //c++;
					System.out.println( i + " " + j);
				}
			}
//             if(c != 0) {
//            	 break;
//             }
		}

	}

}
