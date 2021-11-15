public class sortedArrayrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,10};
		System.out.print(m(arr,0));

	}
	public static boolean m(int[] arr,int idx)
	{  
		if(idx==arr.length-1)
			return true;
		if(arr[idx]<arr[idx+1])
		return	m(arr,idx+1);
		
		return false;
	}

}