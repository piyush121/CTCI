package Ch_3;

import java.util.Stack;

public class three_3 extends Stack<Integer>{
	Stack<Stack<Integer>> setstack=new Stack<>();
	final int limit=100;
	@Override
	public Integer push(Integer data)
	{
		if(setstack.peek().size()<limit)
			setstack.peek().push(data);
		else
		{
			setstack.add(new Stack<>());
			setstack.peek().add(data);
		}
		return data;
	}
	@Override
	public Integer pop()
	{	
		if(setstack.peek().size()>1)
			return setstack.peek().pop();
		int value=setstack.peek().pop();
		setstack.pop();
		return value;
	}

	
}
