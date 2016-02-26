package ch_9;

public class nine_five {
	
	public static void permute(String prefix,String suffix)
	{
		if(suffix.equals(""))
			System.out.println(prefix);
		else
			for(int i=0;i<suffix.length();i++)
				permute(prefix+suffix.charAt(i),suffix.substring(0, i)+suffix.substring(i+1));
	}
	
	public static void main(String[] args) {
		permute("","abc");
	}

}
