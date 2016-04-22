/**
 * 
 */
package ch_4;

/**
 * @author piyush
 *
 */
public class four_5 {

	/**
	 * @param args
	 * 
	 */
	
	public boolean checkBST(treeNode root,Integer max,Integer min)
	{
		if(root==null)
			return true;
		if(min!=null && max!=null)
		if(root.data<=max || root.data>min)
			return false;
		if(!checkBST(root.left,root.data,min))
			return false;
		if(!checkBST(root.right,max,root.data))
			return false;
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
