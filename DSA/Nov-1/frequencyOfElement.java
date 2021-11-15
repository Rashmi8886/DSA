
public class binarylower {
	static int lower_bound(int []arr, int target) {
		  int low =0,high=arr.length-1;
		  
		  while(low<high){ 
			  int mid = low+(high-low)/2; 
			  
			  if(target<=arr[mid]) 
				  high = mid;
			  else low = mid+1;
		   } 
		  
		 if(arr[low]==target)
			 return low;
		  
		  return  -1;
	}
	
		static int Upperr_bound(int []arr, int target) {
			  int low =0,high=arr.length-1;
			  
			  while(low<high){ 
				  int mid = low+(high-low)/2; 
				  
				  if(target>=arr[mid]) 
					  low=mid+1;
				  else high = mid-1;
			   } 
			  
			 if(arr[low]!=target) return -1;
			 
			  return  low;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target=6;
		System.out.println(Upperr_bound(arr,target)-lower_bound(arr,target));

	}

}