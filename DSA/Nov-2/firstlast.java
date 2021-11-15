
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,3,3,3,3,6,6,6,6,7,7,7,7};
		int target=6;
		int left=0;
		int right=arr.length-1;
				
		System.out.println("first occurence"+" "+lowerOftarget(arr,target,left,right)+" "+"last Occurence: "+UpperOftarget(arr,target,left,right));
				

	}
	public static int lowerOftarget(int[] arr,int target,int left, int right)
	{  
		while(left<right)
		{
		int mid=left+(right-left)/2;
		if(arr[mid]>=target)
		{
			right=mid;
		}
		else
			left=mid+1;
		}
		if(arr[left]!=target) return -1;
		
		return left;
			
	}
	public static int UpperOftarget(int[] arr,int target,int left, int right)
	{
		while(left<right)
		{
		int mid=left+(right-left)/2;
		if(arr[mid]<=target)
		{
			left=mid+1;
		}
		else
			right=mid-1;
		}
		
		if(arr[left]!=target) return -1;
		return left;
	}

}
