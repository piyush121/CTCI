package Ch_2;

import java.util.HashSet;

public class two_1 {
	
	public static void remduplicate(LLNode start)
	{
		LLNode ptr;
		HashSet<Integer> myhash=new HashSet<>();
		myhash.add(start.key);
		for(ptr=start.next;ptr!=null;ptr=ptr.next)
		{
			if(myhash.contains(ptr.key))
				{
					start.next=ptr.next;
				}
			else
				{
					myhash.add(ptr.key);
					start=start.next;
				}
		}
	}
	
	public static void main(String[] args) {
		LLNode head=new LLNode(1);
		head.addNode(head, 2);
		head.addNode(head, 3);
		head.addNode(head, 3);head.addNode(head, 3);head.addNode(head, 3);head.addNode(head, 3);
		head.addNode(head, 4);head.addNode(head, 4);head.addNode(head, 4);head.addNode(head, 4);
		head.addNode(head, 4);
		head.addNode(head, 5);
		head.addNode(head, 3);
		head.print(head);
		remduplicate(head);
		System.out.println("\n");
		head.print(head);
		
	}

}
