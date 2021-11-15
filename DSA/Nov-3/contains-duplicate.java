import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,5,1,3,3,4,10,2,4,2};
		System.out.print(containsDuplicate(arr));

	}
	 public static boolean containsDuplicate(int[] nums) {
	      
	     Arrays.sort(nums);
	     for(int i=1;i<nums.length;i++)
	     {
	    	 if(nums[i-1]==nums[i])
	    	 {
	    		 return true;
	    	 }
	    	 
	    	
	     }
	     return false;

}
}