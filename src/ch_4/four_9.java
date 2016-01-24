package ch_4;

public class four_9 {			//Tough Question :(
	
	
	public static void printPath(treeNode root, int target)
	{
		if(root==null)
			return ;
		int depth=depth(root);
		int[] sz=new int[depth];
		printPath(root, target,sz,0);
		
		
	}
	static void printPath(treeNode node,int target,int[] path,int level)
	{
		if(node==null)
			return ;
		int t=0;
		path[level]=node.data;
		for(int i=level;i>=0;i--)
		{
			t+=path[i];
			if(t==target)
				print(path,i,level);
		}
		
		printPath(node.left, target,path,level+1);
		printPath(node.right, target,path,level+1);

	}
	
	static void print(int[] path,int start,int end)
	{
		for(int i=start;i<=end;i++)
			System.out.print(path[i]+" ");
			System.out.println();
	}
	
	public static int depth(treeNode node)
	{
		if (node==null)
			return 0;
		else
			return 1+Math.max(depth(node.left), depth(node.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNode node1=new treeNode(4,null,null);
		treeNode node2=new treeNode(5,null,null);
		treeNode node3=new treeNode(2,null,null);
		treeNode node4=new treeNode(1,null,null);
		treeNode node5=new treeNode(3,null,null);
		treeNode node6=new treeNode(3,null,null);

		binaryTree mytree=new binaryTree();
		mytree.add(node1);
		mytree.add(node2);
		mytree.add(node3);
		mytree.add(node4);
		mytree.add(node5);
		mytree.add(node6);
		
		printPath(mytree.root, 6);

	}

}
