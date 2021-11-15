import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		System.out.print(majorityElement(nums));

	}
	 public static int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        int n=nums.length/2;
	        return nums[n];
	        
	        
	        
	    }
	

}