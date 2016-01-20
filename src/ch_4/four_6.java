package ch_4;

public class four_6 {

	
	public treeNode successor(treeNode node)
	{
		if(node==null)
			return null;
		treeNode ptr;
		if(node.right!=null)
		{
			ptr=node.right;
			while(ptr.left!=null)
				ptr=ptr.left;
			return ptr;
		}
		else
		{
			ptr=node;
			while(ptr.parent!=null && ptr!=ptr.parent.left)
				ptr=ptr.parent;
		}
		return ptr.parent;
	}
	

}
