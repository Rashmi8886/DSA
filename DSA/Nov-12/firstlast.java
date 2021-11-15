public class occurenceusingrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbcaba";
		char target='a';
		int idx=0;
		int left=-1,right=-1;
		m(str,idx,target,left,right);
		

	}
	public static void m(String str,int idx,int target, int left,int right)
	{
		
		if(idx==str.length())
		{
			System.out.print(left+" "+right);
		     return;
		}
		
		else
			{
			
			if(str.charAt(idx)==target)
		     {
			    if(left==-1)
				left=idx;
			    else
				right=idx;
		     }
		m(str,idx+1,target,left,right);
			}
		
	}

}