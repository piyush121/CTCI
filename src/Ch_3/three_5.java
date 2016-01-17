package Ch_3;

import java.util.Stack;
// Didn't implement peek as it was quite obvious.
public class three_5 {
Stack<Integer> stack1=new Stack<>();
Stack<Integer> stack2=new Stack<>();


public Integer enqueue(Integer data)
{
	stack1.add(data);
	return data;
}

public Integer dequeue(Integer data)
{
	if(stack1.size()==1)
		stack1.pop();
	else
		stack2.addAll(stack1);
	stack1.clear();
	Integer value=stack2.pop();
	stack1.addAll(stack2);
	stack2.clear();
	return value;
}
}
