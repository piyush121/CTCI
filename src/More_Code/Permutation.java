package More_Code;

public class Permutation {
	
	public static void permute(String prefix, String str)
	{
		if(str.length()==0)
			System.out.println(prefix);
		for(Character ch : str.toCharArray())
			permute(prefix+ch.toString(),str.substring(0, str.indexOf(ch))+str.substring(str.indexOf(ch)+1));
			
	}
	public static void main(String[] args) {
		String str1="abc";
		
		permute("",str1);
				
				
	}

}
