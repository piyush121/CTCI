package ch_17;

import java.util.Arrays;

public class seventeen_twelve {
	
	public static void pairs(int[] A,int sum)
	{
		Arrays.sort(A);
		int first=0;
		int last=A.length-1;
		while(first<last)
		{
			if(A[first]+A[last]==sum)
				{
					System.out.println(A[first]+","+A[last]);
					first++;
					last--;
				}
			else
				if(A[first]+A[last]<sum)
					first++;
				else
					last--;
			
		}
	}

	public static void main(String[] args) {
		int[] arr={5,3,4,1,2,-2,-1,8,6,4,10,-3};
		pairs(arr,6);
	}
}
