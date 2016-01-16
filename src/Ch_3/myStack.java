package Ch_3;
import java.util.ArrayList;


public class myStack<T> {
	ArrayList<T> node;
	int top=node.size()-1;
	
	public void push(T data)
	{
		
			node.add(data);
			top++;
		
	}
	
	public T pop()
	{
		if(top==-1)
			return null;
		int tmp=top;
		top--;
		return node.get(tmp);
		
	}
	
	public T peek()
	{
		return node.get(top);
	}
	

}
