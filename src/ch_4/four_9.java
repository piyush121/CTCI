package ch_4;

public class four_9 {	
	
	
	static StringBuilder strb=new StringBuilder();
	static int val=0;
	
	public static void printPath(treeNode root, int target)
	{
		if(root==null)
			return ;
		int depth=depth(root);
		int sz[]=new int[depth];
		
		
	}
	static void printPath(treeNode node,int target,int[] path,int level)
	{
		
	}
	
	static void print(int[] path)
	{
		for(int i=0;i<path.length;i++)
			System.out.println(path[i]);
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

	}

}
