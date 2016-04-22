package ch_17;

public class seventeen_six {
	
	public static void findindex(int[] A)
	{
		int low=0;
		int i=0;
		int j=A.length-1;
		int high=A.length-2;
		int mid=0;
		int minright=Integer.MAX_VALUE;
		int maxleft=Integer.MIN_VALUE;
		
		for(low=1;low<A.length-1;low++)
		{	
			if(A[low]>maxleft)
				maxleft=A[low];
			if(A[low]<A[low-1])
				break;
			i++;
		}

		mid=low;
		for(high=A.length-2;high>0;high--)
		{	if(A[high]<minright)
				minright=A[high];
			if(A[high]>A[high+1])
				break;
			j--;
		}

		for(mid=low;mid<A.length-1;mid++)
		{
			while(A[mid]<A[i] && i!=-1)
				i--;
		}
		for(mid=high;mid>0;mid--)
		{
			while(A[mid]>A[j] && j!=A.length)
				j++;
			
		}
		
		System.out.println("Min Index= "+(i+1)+" Max Index= "+(j-1));
	}
	public static void main(String[] args) {
		int [] arr={1,2,4,7,10,11,7,12,6,7,16,18,19};
		findindex(arr);
		
	}

}
