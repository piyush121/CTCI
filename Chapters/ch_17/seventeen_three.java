package ch_17;

public class seventeen_three {
	
	public static int trailingZeros(int n)
	{
		int count=0;
		for(int i=5;i<=n;i*=5)
		{
			count+=n/i;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(trailingZeros(24));
	}
}
