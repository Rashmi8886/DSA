public class Stringsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="is2 sentence4 This1 a3";
		String[] str=s.split(" ");
		String[] st=new String[str.length];
		StringBuffer sb=new StringBuffer();
		
		
		for(int i=0;i<str.length;i++)
			
		{   char t=' ';
			 t=str[i].charAt(str[i].length()-1);
			
		  int index=Character.getNumericValue(t);
		
        st[index-1]=str[i].replace(str[i].substring(str[i].length()-1),"");
		
		}
		 for(int i=0;i<st.length;i++)
	        {
	            sb.append(st[i]);
	            if(i<st.length-1)
	            sb.append(" ");
	        }
	        String strin=sb.toString();
	       System.out.print(strin);
		
                
	}

}
