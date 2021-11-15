public class SortzeroOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,1,2,0,1,1,1,0,0,2,1};
		int left=0,mid=0,right=arr.length-1;
		while(mid<right)
		{
			if(arr[mid]==0)
			{ 
				int temp=arr[left];
				arr[left]=arr[mid];
				arr[mid]=temp;
				   left++;
				   mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else if(arr[mid]==2)
			{
				int temp=arr[right];
				arr[right]=arr[mid];
				arr[mid]=temp;
				right--;
			}
				
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}

	}

}