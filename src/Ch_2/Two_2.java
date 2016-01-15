package Ch_2;

public class Two_2 {
	static int value=0;
	
	public static int klast(LLNode head,int k) //Recursive method. Kind of difficult to grasp in one go.
	{
		int i=0;
		LLNode ptr=head;
		if(head==null)
			return 0;
		if(ptr!=null)
			 i=klast(ptr.next,k)+1;
		if(i==k)
			System.out.println(k + " to last node is :" + ptr.key);
				
		return i;
	}
	
	public static void main(String[] args) {
		LLNode head=new LLNode(1);
		head.addNode(head, 2);
		head.addNode(head, 3);
		head.addNode(head, 4);
		head.addNode(head, 5);
		head.print(head);
		System.out.println("\n");
		klast(head,4);
		
	}
}
