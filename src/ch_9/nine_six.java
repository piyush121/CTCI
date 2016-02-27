package ch_9;

public class nine_six {
	
	public static void permuteParenthesis(int open,int close,String str)// easy recursive solution.
	{
		if(open==0 &&close==0) //base case
			System.out.println(str);
		if(open>0)
			permuteParenthesis(open-1, close+1, str+"(");//decrease open braces and increase close braces.
		if(close>0)
			permuteParenthesis(open, close-1, str+")");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permuteParenthesis(3, 0, "");

	}

}
