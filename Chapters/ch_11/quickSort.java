package ch_11;

import java.util.Arrays;

public class quickSort {
	
	public static void sort(int[] A,int low,int high)
	{	if(low<high)
	{
		int pivot=partition(A,low,high);
		sort(A,low,pivot-1);
		sort(A,pivot+1,high);
	}
	}
	public static int partition(int A[],int low,int high)
	{
		int idx=low;
		int i=low,j=low;
		for(j=low;j<=high;j++)
		{
			if(A[j]<A[idx])
			{
				i++;
				A[j]=A[j]^A[i]^(A[i]=A[j]); //swap  at j and i.
			}
		}
		A[i]=A[i]^A[idx]^(A[idx]=A[i]);
		return i;
		
	}
	
	public static void main(String[] args) {
		int[] arr={5,4,3,2,1,3,4,5};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
