package ch_11;

public class eleven_five {
	
	public static int search(String[] sarr,String target,int low, int mid,int high)
	{
		int mid1=(high+low)/2;
		if(low>high)
			return -1;
		if(sarr[mid].equals(target))
			return mid;
		if(sarr[mid]=="" && mid<sarr.length-1)
			return search(sarr,target,low,mid+1,high);
		if(sarr[mid]=="" && mid>0)
			return search(sarr,target,low,mid-1,high);
		if(sarr[mid].compareTo(target)<0)
			{
			low=mid1+1;
			return search(sarr,target,low,mid1,high); 
			}
		if(sarr[mid].compareTo(target)>0)
		{
		high=mid1-1;
		return search(sarr,target,low,mid1,high); 
		}
			
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		String[] str={"at","","","","ball","","","cat","","","dad","","yo"};
		System.out.println(search(str,"at",0,5,11));
		
	}

}
