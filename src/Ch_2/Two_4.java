package ch_2;

public class Two_4 {
	
	public static LLNode partition (LLNode node,int x)
	{
		LLNode head=null;
		LLNode tail=null;
		LLNode ptr=node;
		LLNode next;
		while(ptr!=null)
		{	
			next=ptr.next;
			if(ptr.key>x)
			{			
					ptr.next=tail;
					tail=ptr;
			}
				
			if(ptr.key<x)
			{
					ptr.next=head;
					head=ptr;
			}
							
			ptr=next;
		}
		ptr=head;
		while(ptr.next!=null)
			ptr=ptr.next;
		ptr.next=new LLNode(x);
		ptr.next.next=tail;
		return head;
	}
	public static void main(String[] args) {
		LLNode head=new LLNode(1);
		
		head.addNode(head, 8);
		head.addNode(head, 9);
		head.addNode(head, 4);
		head.addNode(head, 5);
		head.addNode(head, 1);head.addNode(head, 10);head.addNode(head, 1);head.addNode(head, 11);
		head.addNode(head, 2);
		head.print(head);
		System.out.println("\n");
		head=partition(head, 4);
		head.print(head);

	}

}
