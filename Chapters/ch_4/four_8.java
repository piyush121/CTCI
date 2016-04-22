/**
 * 
 */
package ch_4;

/**
 * @author piyush
 *
 */
public class four_8 {

	/**
	 * @param args
	 */
	public boolean match(treeNode node, treeNode root)
	{
		if(node==null && root==null)	// nothing left to compare
			return true;
		if(root==null || node==null)	//if one of them is empty.
			return false;
		if(node!=root)
			return false;
		
		return match(node.right,root.right)&& match(node.left,root.left);
	}
	public boolean subTreeCheck(treeNode t1,treeNode root)
	{
		if(t1==null || root==null)
			return false;
		if(t1==root)
			if( match(t1,root))
				return true;
		return subTreeCheck(t1, root.left)|| subTreeCheck(t1, root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I leave up to later to implement check it thoroughly.
	}

}
