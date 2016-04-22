package ch_9;

import java.util.HashMap;

public class nine_one {
	static 	HashMap<Integer, Integer> hash=new HashMap<>();

	
	public static int stairsRecur(int n)
	{	
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		
		return stairsRecur(n-1)+stairsRecur(n-2)+stairsRecur(n-3);
		
	}
	public static int stairsMemo(int n)
	{
		hash.put(0,1);
		if(n<0)
			return 0;
		
		else if(hash.containsKey(n))
			return hash.get(n);
		else
			{
				hash.put(n, stairsMemo(n-1)+stairsMemo(n-2)+ stairsMemo(n-3));
				return hash.get(n);
			}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(stairsMemo(32));
		System.out.println(stairsRecur(32));
	}

}
