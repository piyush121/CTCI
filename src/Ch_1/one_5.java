package ch_1;

public class one_5 {
	
	public static void main(String[] args) {
		String str="abcdefgggggggg";
		StringBuffer strb=new StringBuffer();
		int count=1;
		int i=0;
		for(i=0;i<str.length()-1;i++)
			if(str.charAt(i)==str.charAt(i+1))
				{
					
					count++;
				}
			else
				{
					
				    strb.append(str.charAt(i));
				    strb.append(count);
					count=1;
				}
		strb.append(str.charAt(i));
	    strb.append(count);
	    if(strb.length()>str.length())
	    	System.out.println(str);
	    else
	    	System.out.println(strb);
	}
	
		
}
