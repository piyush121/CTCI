package Ch_2;			//Implemented complete singly linked list

public class LLNode {
	private int key;
	private LLNode next=null;
	
	public LLNode(int data)
	{
		this.key=data;
	}
	
	public boolean addNode(LLNode head,int data)
	{	LLNode ptr=head;
	while(ptr.next!=null)
		ptr=ptr.next;
	LLNode mynode=new LLNode(data);
	ptr.next=mynode;
			
		return true;
	}
	
	public LLNode search(LLNode head,int data)
	{
		LLNode ptr=head;
		if(head.key==data)
			return head;
		while(ptr.next!=null)
			if(ptr.next.key==data)
				return ptr.next;
			else
				ptr=ptr.next;
		System.out.println("Node not found");
		return null;
	}
	
	public void deletenode(LLNode head, int data)
	{
		LLNode ptr=head;
		while(ptr.next.key!=data)
			ptr=ptr.next;
		ptr.next=ptr.next.next;
	}
	
	public void print(LLNode head)
	{
		LLNode ptr=head;
		while(ptr!=null)
			{
				System.out.print(ptr.key+"->");
				ptr=ptr.next;
			}
		System.out.print("null");
	}	
	
	public static void main(String[] args) {
		LLNode head=new LLNode(1);
		head.addNode(head, 2);
		head.addNode(head, 3);
		head.addNode(head, 4);
		head.addNode(head, 5);
		head.print(head);
		head.deletenode(head, 3);
		System.out.println("\n");
		head.print(head);
		System.out.println("\n");
		System.out.println(head.search(head, 5).key);
		
	}
}


