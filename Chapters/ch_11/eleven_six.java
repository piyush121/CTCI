package ch_11;

public class eleven_six {		//Good Question.
	
	public static int bsearch(int[] arr,int target)
	{
		int low=0;
		int high=arr.length-1;
		int mid;
		
		while(low<=high)
		{	
			mid=(low+high)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]>target)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	
	public static int matrixSearch(int[][] A,int row,int col, int target)
	{	
		int val=-1;
		int i=0;
		for(i=0;i<row;i++)
		{
			if(A[i][0]>target)
				break;
			else
				val=bsearch(A[i],target);
			if(val!=-1)
				break;
		}
		if(val==-1)
			return val;
		else
			return A[i][val];
				
	}
	
	public static void main(String[] args) {
		int[][] array={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(matrixSearch(array, 4, 3, 4));
	}

}
