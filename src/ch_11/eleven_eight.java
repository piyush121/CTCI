package ch_11;

public class eleven_eight { //So cool and tough question. Anyways.. I'm done for this chapter. Enjoyed coding this chapter.. One of the toughest I've ever done.. phew.. Finally it;s done :)
	
	public static int getRank(int number,rankNode root)
	{
		if(root==null)
			return -1;
		if(root.data==number)
			return root.leftSize;
		if(root.data<number)
			return getRank(number, root.left);
		else
			return root.leftSize+1+getRank(number, root.right); // imp because when we want to go right
																// we should add the no. of left nodes plus
																// the root itself.

	}

}
