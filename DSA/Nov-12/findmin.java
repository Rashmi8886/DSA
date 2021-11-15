import java.util.Scanner;
public class findMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		int min=arr[0];
		int idx=0;
		System.out.print(findMin(arr,min,idx));
		

	}
	public static int findMin(int[] arr,int min,int idx)
	{
		 if(idx==arr.length)
			 return min;
		if(arr[idx]<min)
		  min=arr[idx];
		return findMin(arr,min,idx+1);
		
		
			
	}

}