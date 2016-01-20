package ch_2;
import java.util.Stack;

public class two_7 {
	
	public static boolean isPalindrome(LLNode<Character> node)
	{
		LLNode<Character> slow=node;
		LLNode<Character> fast=node;
		Stack<Character> mystack=new Stack<>();

		while(fast.next!=null && fast!=null)
			{	
				mystack.push(slow.key);
				slow=slow.next;
				fast=fast.next.next;
						
			}
		if(fast.next==null)
			slow=slow.next;
		while(slow!=null)
		{	
			if(mystack.pop()!=slow.key)
				return false;
			slow=slow.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LLNode<Character> head=new LLNode<>('N');
		head.addNode(head, 'I');
		head.addNode(head, 'T');
		head.addNode(head, 'I');
		head.addNode(head, 'N');
		System.out.println(isPalindrome(head));
		
	}

}
