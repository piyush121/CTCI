package ch_3;

import java.util.Stack;		//Quite straight forward.

public class three_6 {
	
	public static Stack<Integer> sort(Stack<Integer> mystack)
	{	
		if(mystack.isEmpty())
			return mystack;
		Stack<Integer> stack1=new Stack<>();
		int tmp;
		stack1.push(mystack.pop());
		while(!mystack.isEmpty())
		{
			if(mystack.peek()>=stack1.peek())
			{
				stack1.push(mystack.pop());
			}
			else
				{
					tmp=mystack.pop();
					while(stack1.peek()>tmp)
					{
						mystack.push(stack1.pop());
					}
					stack1.push(tmp);
				}
		}
		return stack1;
		
	}
	public static void main(String[] args) {
		Stack<Integer> thestack=new Stack<>();
		thestack.push(6);
		thestack.push(4);
		thestack.push(5);
		thestack.push(3);
		thestack.push(1);
		thestack.push(1);
		System.out.println(thestack);
		Stack<Integer> temp=sort(thestack);
		System.out.println(temp);

		
	}

}
