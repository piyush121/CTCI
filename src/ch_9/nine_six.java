package ch_9;

import java.util.ArrayList;
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
					result.add("()"+str);
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
	
	public static void permuteParenthesis2(int open,int close,char[] str,int count, ArrayList<String> list)// easy recursive solution.
	{
		if(open==0 &&close==0) //base case
			list.add(new String(str));
		if(open>0)
			{	
				str[count]='(';
				permuteParenthesis2(open-1, close+1,str,count+1,list );//decrease open braces and increase close braces.
			}
		if(close>0)
			{
				str[count]=')';
				permuteParenthesis2(open, close-1,str,count+1,list); // str+ operation is a O(n) operation. Be careful. Use string builder instead.
			}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result=new ArrayList<>();
		char[] charArray=new char[6];
		permuteParenthesis2(3,0,charArray,0,result);
		System.out.println(result);
	}

}
