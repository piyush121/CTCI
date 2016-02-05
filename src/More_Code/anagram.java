package More_Code;
import java.util.*;
public class anagram {
	static HashMap<Character,Integer> myhash=new HashMap<>();
	
	public static boolean check(String str1,String str2)
	{	if(str1.length()!=str2.length())
			return false;
		for(char ch: str1.toCharArray())
			if(myhash.containsKey(ch))
				myhash.put(ch,myhash.get(ch)+1);
			else
				myhash.put(ch,1);
		
		for(char ch: str2.toCharArray())
			if(myhash.containsKey(ch))
				{
					myhash.put(ch,myhash.get(ch)-1);
					if(myhash.get(ch)==0)
						myhash.remove(ch);
				}
			else
				return false;
		if(myhash.size()==0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str1="";
		String str2="";
		System.out.println(check(str1,str2));
		System.out.println((int)'a');
	}
}
