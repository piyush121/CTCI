package ch_11;

import java.util.Arrays;

public class eleven_seven {
	
	public static int LIS(htwt[] A)
	{
		int j=0;
		int[] res=new int[A.length];
		int i=1;
		Arrays.fill(res, 1);
		for(i=1;i<res.length;i++)
		{	
			j=0;
			while(j<i)
			{
				if(A[j].compareTo(A[i])<0)
					res[i]=Math.max(res[i], 1+res[j]);
				j++;
				
			}
		}
		Arrays.sort(res); //just for fun.
		return res[res.length-1];
	}
	
	
	
	public static void main(String[] args) {
		htwt[] arr={new htwt(1,2),new htwt(4,2),new htwt(5,4),new htwt(6,5),new htwt(5,6)};
		System.out.println(LIS(arr));
	}

}
