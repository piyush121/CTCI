package ch_11;

public class mergerSort {

	public static void MergeSort(int[] A,int[] helper,int low,int high)
	
	{	while(low<high)
		{
			int mid=(low+high)/2;
			MergeSort(A,helper,low,mid);
			MergeSort(A,helper, mid+1, high);
			merge(A,helper,low,high,mid);
		}
		
	}
	
	public static void merge (int[] arr, int [] helper, int low,int high,int mid)
	{	
		
		for(int i=low;i<=high;i++)
		{
			helper[i]=arr[i];
		}
		int helperleft=low;
		
		int helperright=mid+1;
		int curr=low;
		
		while(helperleft<=mid && helperright<=high)
		{
			if(helper[helperleft]<=helper[helperright])
				{
					arr[curr]=helper[helperleft];
					helperleft++;
				}
			else
			{
				arr[curr]=helper[helperright];
				helperright++;
			}
			curr++;
			System.out.println("hi");
		}
		
		int rem=mid-helperleft;
		for(int i=0;i<=rem;i++)
			arr[curr+i]=helper[helperleft+i];
		
	}
	public static void main(String[] args) {
		
		int[] array={5,4,3,2,1};
		int[] helper = new int[array.length];
		MergeSort(array,helper,0,array.length-1);
		
		System.out.println(array);
		
	}
	
}

