package ch_4;

import java.util.HashSet;

public class four_7 {
	
	public treeNode commonAncestor(treeNode n1,treeNode n2)		//If we are allowed to use additional data structure. But sadly we are not allowed.
	{
		HashSet<treeNode> myhash=new HashSet<>();
		while(n1!=null)
		{
			myhash.add(n1);
			n1=n1.parent;
		}
		
		while(n2!=null)
		{
			if(myhash.contains(n2))
				return n2;
			n2=n2.parent;
		}
		
		return null;
	}
	
	public boolean search(treeNode root,treeNode node)
	{
		if(root==null)
			return false;
		if(root == node)
			return true;
		return (search(root.left,node)||search(root.right,node));
	}
	
	public treeNode commonAncestor(treeNode root,treeNode n1, treeNode n2)
	{
		if(root ==null)
			return null;
		if(root==n1 || root ==n2)
			return root;
		boolean inLeftn1=search(root,n1);
		boolean inLeftn2=search(root,n2);
		if(inLeftn1!=inLeftn2)
			return root;
		if(inLeftn1)
			return commonAncestor(root.left,n1,n2);
		return commonAncestor(root.right,n1,n2);
		
		
		
	}
}
