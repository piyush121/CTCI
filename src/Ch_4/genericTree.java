package Ch_4;
import java.util.*;

class node<T>
{
	T data;
	ArrayList<node<T>> children;
	
	public node(T data)
	{
		this.data=data;
		this.children=new ArrayList<>();
	}
}
public class genericTree<T> {
	
	node<T> root;
	
	public genericTree(T data) {
		// TODO Auto-generated constructor stub
		root=new node<T>(data);
		
	}

}
