package ch_2;
							///Slightly changed the logic for my own satisfaction.
public class two_6 {
	
	public static void loop(LLNode<Integer> node)
	{
		LLNode<Integer> ptr1=node;
		LLNode<Integer> ptr2=node;
		
		while(ptr1!=null)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next.next;
			if(ptr1==ptr2)
				break;
		}
		
		System.out.println("1st intersectionpoint: "+ptr1.key);		//eventually it is gonna find a loop.
		
		ptr2=node;
		while(ptr2.key!=ptr1.key)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		System.out.println("Starting of the loop is :"+ptr1.key);
	}

		public static void main(String[] args) {
			LLNode<Integer> head=new LLNode<>(1);
			head.addNode(head, 2);
			head.addNode(head, 3);
			head.addNode(head, 4);
			head.addNode(head, 5);
			head.addNode(head, 6);


			head.print(head);
			
			System.out.println("\n");

			LLNode<Integer> ptr=head;
			while(ptr.next!=null)
				ptr=ptr.next;
			ptr.next=head;
			LLNode<Integer> extra=new LLNode<>(7);
			extra.next=head;
			head=extra;
			loop(head);
		}
}
