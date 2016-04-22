package ch_11;

import java.util.ArrayDeque;
import java.util.Arrays;

public class eleven_one {

	public static void merge(int[] A,int[] B,int abuf)
	{
		
		int k=abuf-1;
		int j=B.length-1;
		int asize=A.length-1;
		while(j>=0)
		{
			if(k>=0 && B[j]<A[k] )
			{	
				A[asize]=A[k];
				k--;
				
			}
			else 
				{
					A[asize]=B[j];
					j--;
				}
			asize--;
		}
		
	}
	public static void main(String[] args) {
		
		int[] a1={1,4,5,7,-1,-1,-1};
		int[] a2={0,6,9};
		merge(a1,a2,4);
		System.out.println(Arrays.toString(a1));
	}
	
}
