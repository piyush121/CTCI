package ch_11;

public class rankNode {

	int data;
	rankNode left=null;
	rankNode right=null;
	int leftSize=0;
	
	public void insert(rankNode mynode,rankNode root)
	{
		if (root==null)
			root=mynode;
		else
			if(root.data>mynode.data)
				{
				root.leftSize++;	
				insert(mynode,root.left);
				}
			else
				insert(mynode,root.right);
		
	}
	
	rankNode(int x)
	{
		this.data=x;
	}
}
