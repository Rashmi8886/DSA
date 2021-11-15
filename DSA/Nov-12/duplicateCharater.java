	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbghaajklgg";
		boolean[] map=new boolean[256];
		int idx=0;
		String newStr="";
		
		
		m(str,idx,map,newStr);

	}
	public static void m(String str,int idx,boolean[] map,String newStr)
	{
		if(idx==str.length())
		{
			System.out.println(newStr);
		     return;
		}
		 if(map[str.charAt(idx)]==false)
		 {
			 map[str.charAt(idx)]=true;
			 newStr+=str.charAt(idx);
			 m(str,idx+1,map,newStr);
			 
		 }
		 else
			 m(str,idx+1,map,newStr);
	}

}