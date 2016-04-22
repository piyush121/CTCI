package ch_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class eleven_Two {
	
	static ArrayList<String> arr=new ArrayList<>();
	static HashMap<String,List<String>> hash=new HashMap<>();
	
	public static void sortAnagram(String[] str)
	{
		for(String st: str)
		{	
			String key=anagramComparator.sortChars(st);
			if(!hash.containsKey(key))
			{
				List<String> mylist=new LinkedList<>();	
				mylist.add(st);
				hash.put(key,mylist);
			}
			else
				{
				List<String> mylist1=hash.get(key)	;
				mylist1.add(st);
				hash.put(key,mylist1);
				}
		}
		int idx=0;
		for(String key: hash.keySet())
		{
			List<String> thelist=hash.get(key);
			for(String str1 : thelist)
				{
					str[idx]=str1;
					idx++;
				}
		}
	}
	public static void main(String[] args) {
		
	}

}
