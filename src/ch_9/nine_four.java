package ch_9;

import java.util.ArrayList;

public class nine_four {
	public static ArrayList<Integer> getsets(ArrayList<Integer> arr,int index)
	{
		if(index==0){
			ArrayList<Integer> temp=new ArrayList<>();
			temp.add(arr.get(index));
			return arr;
		}
		
		for(int i=index;i>0;i--){
			arr.addAll(getsets(arr,index-1));
		}

		return arr;	
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> AL=new ArrayList<>();
		AL.add(1);AL.add(2);AL.add(3);
		System.out.println(getsets(AL,AL.size()-1));
	}

}
