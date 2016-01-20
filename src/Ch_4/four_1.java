package ch_4;
import java.util.*;

public class four_1 {				//O(N), tried to cut down calls in recursion.
	static boolean flag=true;		// Recursion is a hard concept sometimes. But once it is mastered.
	static int rightheight;			// its solution is quite elegant but not quite efficient.
	static int leftheight;
	
	public static int checkbalanced(treeNode root)
	{
		if(root==null)
			return 0;
		else 
			
		{
			rightheight=Math.abs(checkbalanced(root.right));
				if(rightheight==-1)
				{
					flag=false;
					return -1;
				}			leftheight= Math.abs(checkbalanced(root.left));
				if (leftheight==-1)
				{
					flag=false;
					return -1;
				}			if(Math.abs(rightheight - leftheight)>1)
				{
					flag=false;
					return -1;
				}
		
			}
		return Math.abs(rightheight - leftheight)+1;
	}
public static void main(String[] args) {
	treeNode node1=new treeNode(4,null,null);
	treeNode node2=new treeNode(5,null,null);
	treeNode node3=new treeNode(2,null,null);
	treeNode node4=new treeNode(1,null,null);
	treeNode node5=new treeNode(3,null,null);
	binaryTree mytree=new binaryTree();
	mytree.add(node1);
	mytree.add(node2);
	mytree.add(node3);
	mytree.add(node4);
	mytree.add(node5);
	checkbalanced(node4);
	System.out.println(flag);
}
}
