mport java.util.*;

public class intersectionbybinarysearch {

public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,3,4,6};
		int[] arr2 = {2,5,6,7,3};
		
		List<Integer> arrList = new ArrayList<>();
		Arrays.sort(arr2);
		
		for(int val: arr1) {
			
			if(findNum(arr2, val) == true) {
				if(!arrList.contains(val)) {
					arrList.add(val);	
				}
			}
			
		}
		
		System.out.println(arrList);
		
	}
	
	public static boolean findNum(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == target)return true;
			
			if(arr[mid] < target) {
				start = mid + 1;
			}else {
				end = mid -1;
			}
		}
		
		return false;
	}


	

}

