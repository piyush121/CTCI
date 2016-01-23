package ch_4;

public class four_9 {	
	
	
	static StringBuilder strb=new StringBuilder();
	static int val=0;
	
	public static int printPath(treeNode root, int target)
	{
		if(root==null)
			return 0;
		if(root.data==target)
			{
				strb.append(root.data);
				return target;
			}
		
		if(root.data<target)
			{	
			
				strb.append(root.data);
				val=printPath(root.left, target-root.data);
			}
		if(root.data>target)
		{
			return 0;
		}
		val=printPath(root.right, target - root.data);
		
		return val;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
