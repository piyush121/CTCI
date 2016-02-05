package More_Code;

public class Quick_Sort {
	
	public static void qsort(int[] nums,int low,int high){
	
	   int pos=0;
	   if(low<high)
	   {
       pos=partition(nums,low,high);
	   System.out.print(pos+"");

	   qsort(nums,low,pos-1);
	   qsort(nums,pos+1,high);
	   }
       
     }
   
   public static int partition(int[] arr,int low,int high)
   {	int j=low;
   		int pivot=low;

       for(int i=low;i<=high;i++)
    	   if(arr[pivot]>arr[i])
    		   j++;
       swap(j,low,arr);
       return j;
              
   }     
   
   public static void swap(int x, int y,int[] arr)
   {
	   
         int temp = arr[x];
         arr[x] = arr[y];
         arr[y] = temp;
         
   }

   public static void main(String[] args)
   {
	   int A[]={8,7,6,5,4,3,2,1};
	   qsort(A,0,7);
       for(int i=0;i<A.length;i++)
    	   System.out.print("\n"+A[i]+" ");
   }
}
