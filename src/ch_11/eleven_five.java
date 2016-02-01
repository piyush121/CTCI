package ch_11;

public class eleven_five {
	
	public static int search(String[] sarr,String target,int low, int high)
	{
		int mid=(high+low)/2;
		if(low>high)
			return -1;
		if(sarr[mid].isEmpty())
		{
			int left=mid-1;
			int right=mid+1;
			while(left>=low && right <=high)
			{
				if(!sarr[left].isEmpty())
				{
					mid=left;
					break;
				}
				if(!sarr[right].isEmpty())
				{
					mid=right;
					break;
				}
				left--;
				right++;
			}
			
		}
		
		if(sarr[mid].equals(target))
			return mid;
		
		if(sarr[mid].compareTo(target)<0)
			{
			low=mid+1;
			return search(sarr,target,low,high); 
			}
		if(sarr[mid].compareTo(target)>0)
		{
		high=mid-1;
		return search(sarr,target,low,high); 
		}
			
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		String[] str={"at","","","","ball","","","cat","","","dad","","yo"};
		System.out.println(search(str,"ball",0,12));
		
	}

}
