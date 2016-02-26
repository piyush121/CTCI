package ch_9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javafx.util.Pair;

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
	
	public static boolean robotDP(int x,int y,ArrayList<Pair<Integer, Integer>> path,HashMap<Pair<Integer,Integer>,Boolean> cache){
		
		if(x<0||y<0)	//checking out of bounds.
			return false;
		boolean atOrigin=false;
		if(x==0 && y==0)
			atOrigin=true;
		Pair<Integer,Integer> p=new Pair<>(x,y);
		if(cache.containsKey(new Pair<>(x,y))) //if we have already checked that a path from this location exist then don't go over it again ! Use the results again.
			return true;
		Boolean found=false;
		if(atOrigin||robotDP(x-1,y,path,cache)||robotDP(x,y-1,path,cache))
		{	
			path.add(p);
			found=true;
		}
		cache.put(p,found);

		return found;
		
	}
	public static void main(String[] args) {
		System.out.println(robot(3,3));
	}

}
