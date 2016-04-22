package ch_3;

import java.util.Stack;

public class three_4 extends Thread{
	
	public static void hanoi(int n,Stack<Integer> from,Stack<Integer> to,Stack<Integer> use)
	{
		
		if(n==1)
			to.push(from.pop());
				
		else
			{
				hanoi(n-1,from,use,to);
				hanoi(1,from,to,use);
				hanoi(n-1,use,to,from);
			}
	}

	
	public static void main(String[] args) {
		
		Stack<Integer> from=new Stack<>();
		Stack<Integer> to=new Stack<>();
		Stack<Integer> use=new Stack<>();
		from.push(5);from.push(4);from.push(3);from.push(2);from.push(1);
		from.push(1);from.push(1);from.push(1);from.push(1);from.push(1);
		from.push(1);from.push(1);from.push(1);from.push(1);from.push(1);
		from.push(1);from.push(1);from.push(1);from.push(1);from.push(1);
		from.push(1);from.push(1);from.push(1);from.push(1);from.push(1);
		System.out.println("Initial Stack : "+from);
		System.out.println("In Progress.....");

		hanoi(from.size(),from,to,use);
		System.out.println("Done");

		System.out.println("Final Stack :   "+to);
		System.out.println("Initial Stack : "+from);

	}
}
