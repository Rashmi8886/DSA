import java.util.*;
public class StringDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		String str2="y";
		System.out.print(findTheDifference(str,str2));

	}
public static char findTheDifference(String s, String t) {
        
        char[] arr=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr2[i])
                continue;
            else
                return arr2[i];
        }
        return arr2[arr2.length-1];
        
    }
}