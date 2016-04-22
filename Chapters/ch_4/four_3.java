package ch_4;

public class four_3 {               //ELEGANT RECURSIVE SOLUTION. O(NlogN).

	public static treeNode func(int[] A,int low,int high)
	{	
		treeNode root;
		if(low>high)
			return null;
		else
		{	
			int mid=high+low/2;
			root=new treeNode(A[mid],null,null);
			root.left=func(A,low,mid-1);
			root.right=func(A,mid+1,high);
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
		treeNode root=func(arr,0,8);
		binaryTree.inOrder(root);
	}
}
