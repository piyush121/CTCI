package Ch_3;
import java.util.*;
// Didn't know we could extend stack class to edit it for our need... Great learning.
public class three_2 extends Stack<Integer>{

	private static final long serialVersionUID = 1L;
	Stack<Integer> min=new Stack<>();
	
	@Override
	public Integer push(Integer data)
	{	
		if(min.size()==0)
		{
			super.push(data);
			min.push(data);
		}
		else if(min.peek()>=data)
			{
				min.push(data);
				super.push(data);
			}
		else
			{
				super.push(data);
			}
		return data;
		
	}
	@Override
	public Integer pop()
	{
		int value=super.pop();
		if(value==min.peek())
			min.pop();
		return value;
	}
	
	public Integer minimum()
	{
		return this.min.peek();
	}

	
	public static void main(String[] args) {
		three_2 mys=new three_2();
		System.out.println("Pushing "+mys.push(10));
		System.out.println("Minimum value "+mys.minimum());
		System.out.println("Pushing "+mys.push(4));
		System.out.println("Minimum value "+mys.minimum());

		System.out.println("Pushing "+mys.push(2));
		System.out.println("Minimum value "+mys.minimum());

		System.out.println("Popping "+mys.pop());
		System.out.println("Minimum value "+mys.minimum());

		System.out.println("Popping "+mys.pop());	
		System.out.println("Minimum value "+mys.minimum());

		
	}
}

