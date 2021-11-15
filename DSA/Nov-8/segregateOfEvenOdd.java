public class leet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {12, 34, 45, 9, 8, 90, 3};
   int left=0;
   int right=arr.length-1;
   while(left<right)
   {
	   if(right<=arr.length-1)
	   {
		   left++;
	   }
	   else if(arr[right]%2==1)
	   {
		   right--;
	   }
	   else
	   {
		   if(left<right)
	   {
		   int temp=arr[left];
		   arr[left]=arr[right];
		   arr[right]=temp;
		   left++;
		   right--;
	   }
   }
   }
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(arr[i]+" ");
	}

}
}