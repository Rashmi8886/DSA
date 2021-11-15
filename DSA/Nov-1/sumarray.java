import java.util.*;
public class leet5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {2,7,11,15};
		int target=9;
		int[] arr=twoSum(numbers,target);
		for(int i=0;i<2;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		 public static int[] twoSum(int[] numbers, int target) {
		        int[] arr =new int[2];
		        int k=0;
		        for(int i=0;i<numbers.length;i++)
		        {
		            for(int j=i+1;j<numbers.length;j++)
		            {
		                if(numbers[i]+numbers[j]==target)
		                {
		                   arr[k++]=i+1;
		                    arr[k]=j+1;
		                    break;
		                }
		            }
		            
		        }
		        return arr;
		        
		    }
		
		 
		
				

	


}
