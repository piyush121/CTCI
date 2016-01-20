package Ch_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class four_4 {

	public ArrayList<LinkedList<treeNode>> depth(treeNode root)
	{
		ArrayList<LinkedList<treeNode>>	list=new ArrayList<>();
		list.get(0).add(root);

			for(int i=0;i<list.size();i++)
			{
				Iterator<treeNode> iter=list.get(i).iterator();
				while(iter.hasNext())
					{	
						if(iter.next().left!=null)
							list.get(i+1).add(iter.next().left);
						if(iter.next().right!=null)
							list.get(i+1).add(iter.next().right);
					}
			}
			
		
		return list;
	}
}
