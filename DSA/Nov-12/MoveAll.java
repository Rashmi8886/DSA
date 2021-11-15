public class movecharAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abxxcdefxgh";
		int idx=0;
		String newStr="";
		int count=0;
		m(str,idx,newStr,count);
		

	}
     public static void m(String str,int idx,String newStr,int count)
     {    
    	 if(idx==str.length())
    	 {
    		 while(count>0)
    		 {
    			 newStr+='x';
    			 count--;
    		 }
    		 System.out.print(newStr);
    		 return;
    	 }
    	 if(str.charAt(idx)=='x')
    	 {
    		 count++;
    		 m(str,idx+1,newStr,count);
    	 }
    	 else
    	 {
    		 newStr+=str.charAt(idx);
    		 m(str,idx+1,newStr,count);
    		 
    	 }
     }
}