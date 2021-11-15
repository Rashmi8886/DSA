public class minisorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,4,5,1,2};
		System.out.print(findMin(nums));

	}

	    public static int findMin(int[] nums) {
	           int left=0,right=nums.length-1;
		        
		        if(nums[left]<=nums[right])
		            return nums[left];
		        while(left<right)
		        {   
		            int mid=left+(right-left)/2;
		            
		            if(nums[mid]>nums[mid+1])
		            	return nums[mid+1];
		           
		            else if(nums[mid]<nums[mid-1])
		                return nums[mid];
		            else if(nums[left]<=nums[mid])
		                left=mid+1;
		            else
		                right=mid-1;
		        }
			            
			return -1;
		            
		    } 
	        
	    }