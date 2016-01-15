package Ch_2;

public class two_3 {			//Nailed it.
	
	public static void delete(LLNode node)
	{
		LLNode ptr=node;
		while(ptr.next.next!=null)
		{
			ptr.key=ptr.next.key;
			ptr=ptr.next;
		}
		ptr.key=ptr.next.key;
		ptr.next=null;
	}
	
	public static void main(String[] args) {
		LLNode head=new LLNode(1);
		head.addNode(head, 2);
		head.addNode(head, 3);
		head.addNode(head, 4);
		head.addNode(head, 5);
		head.addNode(head, 8);
		head.addNode(head, 6);
		head.addNode(head, 14);
		head.addNode(head, 12);
		
		head.print(head);
		System.out.println("\n");
		LLNode node=head;
		while(node.key!=3)
			node=node.next;
		System.out.println("Deleting: "+node.key);
		delete(node);
		head.print(head);

		

	}

}
