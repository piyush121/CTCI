package Ch_3;

public class three_1 {

	int[] arr=new int[9];
	int[] stacknum={-1,-1,-1};
	
	
	
	public void push(int num,int data)
	{
		if(this.stacknum[num]==-1)
		{
			int index=num*3;
			this.stacknum[index]=data;
		}
		else if(stacknum[num]+1>=3)
			System.out.println("Stack Full");
		
		else 
			{
				stacknum[num]++;
				arr[stacknum[num]]=data;
			}
	}
	
	public void pop(int num)
	{
		if(this.stacknum[num]==-1)
			System.out.println("Stack already empty");
		else if(stacknum[num]==num*3)
			stacknum[num]=-1;
		else
			{
				arr[stacknum[num]]=Integer.MIN_VALUE;	
				stacknum[num]--;
			}
	}
	
}
