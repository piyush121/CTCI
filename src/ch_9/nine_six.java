package ch_9;

import java.util.HashSet;
import java.util.Set;

public class nine_six {
	
	public static void permuteParenthesis(int open,int close,String str)// easy recursive solution.
	{
		if(open==0 &&close==0) //base case
			System.out.println(str);
		if(open>0)
			permuteParenthesis(open-1, close+1, str+"(");//decrease open braces and increase close braces.
		if(close>0)
			permuteParenthesis(open, close-1, str+")"); // str+ operation is a O(n) operation. Be careful. Use string builder instead.

	}
	
	public static Set<String> permuteParenthesis1(int num)
	{	
		Set<String> result=new HashSet<String>();
		if(num==0)//base case
			{
				result.add("");
				return result;
			}
		else
			{
				Set<String> temp=permuteParenthesis1(num-1); // storing result from previous result.
				for(String str : temp)
				{
					for(int i=0;i<str.length();i++)
					{
						if(str.charAt(i)=='(')
						{
							result.add(insertParen(str, i)); // addinng `()` after every left parenthesis.
						}
					}
					result.add("()"+str); // adding "()" to the beginning.
				}
				
			}
		return result;
		
		
	}
	public static String insertParen(String str,int leftindex)
	{
		String left=str.substring(0, leftindex+1);
		String right=str.substring(leftindex+1);
		return left+"()"+right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permuteParenthesis1(3));

	}

}
