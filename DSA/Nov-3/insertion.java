public class testInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,2,2,1,8};
	    for(int i=0;i<arr.length;i++)
	    {  int key=arr[i];
	       int j=i-1;
	       while(j>=0&&arr[j]>key)
	       {
	    	   arr[j+1]=arr[j];
	    	   j--;
	    	   
	       }
	       arr[j+1]=key;
	    }
	    for(int x:arr)
	    	System.out.print(x+" ");

	}

}
