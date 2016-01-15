package Ch_2;

public class Two_5 {
	
	public static void add(LLNode<String> node1, LLNode<String> node2)
	{
		int i=1;
		Integer num1=0;
		Integer num2=0;
		LLNode<String> ptr=node1;
		
		while(ptr!=null)
		{
			num1+=i*Integer.parseInt(ptr.key);
			i=i*10;
			ptr=ptr.next;
		}
		ptr=node2;

		i=1;
		while(ptr!=null)
		{
			num2+=i*Integer.parseInt(ptr.key);
			i=i*10;
			ptr=ptr.next;
		}

		num1=num1+num2;

		String str=num1.toString();
		LLNode<Character> mynode=new LLNode<>(str.charAt(0));
		for(int j=1;j<str.length();j++)
			mynode.addNode(mynode,str.charAt(j) );
		mynode.print(mynode);
		
	}
	
	public static void main(String[] args) {
		LLNode<String> head=new LLNode<String>("7");
		head.addNode(head, "1");
		head.addNode(head, "6");
		head.print(head);
		LLNode<String> tail=new LLNode<>("5");
		tail.addNode(tail, "9");
		tail.addNode(tail, "2");
		System.out.println("\n");
		tail.print(tail);
		System.out.println("\n");

		add(head,tail);				//Can be reversed easily using stacks but i didn't do it. 
	}

}
