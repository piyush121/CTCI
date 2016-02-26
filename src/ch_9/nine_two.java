package ch_9;

/**
 * @author Piyush Chaudhary
 *
 */
public class nine_two {
	
	public static int robot(int x,int y)
	{
		if(x==0 && y==0)
			return 1;
		else if(x<0 || y<0)
			return 0;
			
		else
			return robot(x,y-1)+robot(x-1,y);
	}
	public static void main(String[] args) {
		System.out.println(robot(3,3));
	}

}
