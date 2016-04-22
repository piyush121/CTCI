package ch_11;

public class binarySearch {
	
	public static int bsearch(int[] A,int low,int high,int target)
	{
				
		if(low<=high)
			{
			int mid=(low+high)/2;
			if(A[mid]==target)
				return mid;
			else if(A[mid]<target)
				return bsearch(A,mid+1,high,target);
			else if(A[mid]>target )
				return bsearch(A,low,mid-1,target);
			
		}		
		return -1;
	}
		public static void main(String[] args) {
			int[] arr={1,2,3,4,5,6,7,8,9};
			System.out.println(bsearch(arr,0,8,10));
		}
}
