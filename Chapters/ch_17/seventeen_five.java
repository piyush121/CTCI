package ch_17;

class Result
{
	int hits=0;
	int pseudoHits=0;
	@Override
	public String toString() {
		return "Result [hits=" + hits + ", pseudoHits=" + pseudoHits + "]";
	}
	
}

public class seventeen_five {
	
	public static int code(char c)
	{
		switch(c)
		{
		case 'B':
			return 0;
		case 'G':
			return 1;
		case 'R':
			return 2;
		case 'Y':
			return 3;
		default:
			return -1;
		}
	}
	
	public static Result solution(String guess,String solution)
	{	Result res=new Result();
		int[] freq=new int[4];
		if(guess.length()!=solution.length())
			System.out.println("0 hits and 0 pseadohits");
		//compute hits;
		for(int i=0;i<guess.length();i++)
		{
			if(guess.charAt(i)==solution.charAt(i))
				res.hits++;
			else
			{	int code=code(solution.charAt(i));
				freq[code]++;
			}
			
		}
		
		//compute pseudo hits;
		for(int j=0;j<guess.length();j++)
		{	int code=guess.charAt(j);
			if(guess.charAt(j)!=solution.charAt(j) && freq[code]>0)
					{
						res.pseudoHits++;
						freq[code]--;
					}
		}
		return res;
		
	}

}
