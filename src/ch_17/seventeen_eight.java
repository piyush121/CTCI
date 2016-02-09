package ch_17;

public class seventeen_eight {

	public int maxSum(int[] A)
	{
		int maxsum=0;
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum+=A[i];
			if(maxsum<sum)
				maxsum=sum;
			else if(sum<0)
				sum=0;
		}
		return maxsum;
	}
}
