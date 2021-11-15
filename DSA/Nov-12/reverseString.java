
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello geeks";
		int idx=s.length()-1;
		String newStr="";
		System.out.print(reverseString(s,idx,newStr));

	}
	public static String  reverseString(String s,int idx,String newStr)
	{  
       
       if(idx<=0) {
    	   return newStr+s.charAt(idx);
       }
	
    	return newStr+s.charAt(idx)+reverseString(s,idx-1,newStr);
       
        
    }
}