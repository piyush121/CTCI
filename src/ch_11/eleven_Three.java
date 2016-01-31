package ch_11;

public class eleven_Three {
	
	public static int find(int[] arr,int x)
	{
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==x)
			return mid;
			
			if(arr[mid]>arr[low])
			{
				if(x>arr[low] && x<arr[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			else if(arr[mid]<arr[high])
			{
				if(x>arr[mid] && x<arr[high])
					low=mid+1;
				else
					high=mid-1;
			}
			else if(arr[low]==arr[mid]) //left half is repeated.
			{
				if(arr[mid]!=arr[high])
					low=mid+1;
			}
			else
			{	
				int[] left=new int[mid-low+1];
				int[] right=new int[high-mid+1];
				for(int i=low;i<=mid;i++)
					left[i]=arr[i];
				for(int j=mid+1;j<=high;j++)
					right[j]=arr[j];
				int result =find(left,x);
				if( result==-1)
					return find(right,x);
				else 
					return result;
				}
				
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] A={15,16,19,20,25,1,2,3,4,5,6,10,14};
		System.out.println(find(A,10));
	}
}
