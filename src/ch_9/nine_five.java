package ch_9;

import java.util.ArrayList;

public class nine_five {
	
	public static void permute(String prefix,String suffix)
	{
		if(suffix.equals(""))
			System.out.println(prefix);
		else
			for(int i=0;i<suffix.length();i++)
				permute(prefix+suffix.charAt(i),suffix.substring(0, i)+suffix.substring(i+1));
	}
	
	public static ArrayList<String> permute2(String str)
	{
		if(str==null)
			return null;
		ArrayList<String> permutations=new ArrayList<>();
		if(str.length()==0)//Base case
		{
			permutations.add("");
			return permutations;
		}
		char first=str.charAt(0);//Will scatter first character over the whole string at every place.
		ArrayList<String> words=permute2(str.substring(1));
		
		for(String word : words)
			permutations.addAll(insert(word,first));
		
		
		return permutations;
		
	}
	public static ArrayList<String>  insert(String word,char ch)//insert character into every place of the String.
	{
		ArrayList<String> perms=new ArrayList<>();
		if(word.length()==0)
			{
				perms.add(String.valueOf(ch));
				return  perms;
			}

		for(int i=0;i<=word.length();i++)
			perms.add(word.substring(0, i)+ch+word.substring(i));
		
		return perms;
	}
	
	public static void main(String[] args) {
		System.out.println(permute2("abc"));
	}

}
