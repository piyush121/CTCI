package ch_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class four_4 {

	public static ArrayList<LinkedList<treeNode>> depth(treeNode root)
	{
		ArrayList<LinkedList<treeNode>>	result=new ArrayList<LinkedList<treeNode>>();
		result.add(new LinkedList<treeNode>());		//No additional data structures needed like in the book.
		result.get(0).add(root);					// Just one arraylist and you are done !

			for(int i=0;i<result.size();i++)
			{
				Iterator<treeNode> iter=result.get(i).iterator();
				while(iter.hasNext())
					
					{	treeNode node=iter.next();
						if(node.right==null && node.right==null)	//to check leaf node.
							continue;
						if(result.size()==i+1)						//to check whether there is already a new list created for one level below.
							result.add(new LinkedList<treeNode>());
						if(node.left!=null)
							result.get(i+1).add(node.left);
						if(node.right!=null)
							result.get(i+1).add(node.right);
						
					}
			}
		
		return result;
	}
	
	public static void main(String[] args) {
		treeNode node1=new treeNode(4,null,null);
		treeNode node2=new treeNode(5,null,null);
		treeNode node3=new treeNode(2,null,null);
		treeNode node4=new treeNode(1,null,null);
		treeNode node5=new treeNode(3,null,null);
		treeNode node6=new treeNode(6,null,null);
		binaryTree mytree=new binaryTree();
		mytree.add(node1);
		mytree.add(node2);
		mytree.add(node3);
		mytree.add(node4);
		mytree.add(node5);
		mytree.add(node6);

		
		ArrayList<LinkedList<treeNode>> result=depth(mytree.root);
		
		System.out.println(result);
	}
}
