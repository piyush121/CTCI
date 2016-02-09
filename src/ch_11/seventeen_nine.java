package ch_11;

import java.util.HashMap;

public class seventeen_nine {
	
	public HashMap<String,Integer> setup(String[] dict)
	{
		HashMap<String,Integer> table=new HashMap<>();
		for(String word: dict)
		{
			word=word.toLowerCase();
			if(word.trim()!="")
				{if(table.containsKey(word))
					table.put(word, table.get(word)+1);
				else
					table.put(word,0);
				}
		}
		return table;
	}

}
