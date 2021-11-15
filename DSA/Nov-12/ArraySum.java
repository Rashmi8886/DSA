public class recursive2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,5,5,10};
		
		System.out.print(arraySum(arr,arr.length-1));

	}
	public static int arraySum(int[] arr,int N)
	{  
		if(N==0)
			return arr[0];
	   return arraySum(arr,N-1)+arr[N];
	}

}