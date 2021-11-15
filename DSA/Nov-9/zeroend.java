public class SortZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {0,1,1,1,1,1,0,0,0};
       Zeros(arr);
     
	}
	public static void Zeros(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==0)
			{   
				if(arr[j]==1)
				{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				}
				j--;
			}
			else
			i++;
			
			 
			 
			
			
		}
		  for(int x:arr)
	       {
	    	   System.out.print(x+" ");
	       }
	}

}
