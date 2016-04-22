package ch_1;

public class one_6 {
	
	
	
	public static int[][] rotate(int[][] A)
	{	
		int[][] rot = new int[A.length][A.length];
		for(int i=0;i<A.length;i++)
			for(int j=0;j<A.length;j++)
				{
					rot[j][A.length-1-i]=A[i][j];
					
				}
					
				
				
		
		return rot;
	}

	public static void main(String[] args) {
		int[][] arr={{1,1,1},{0,0,0},{1,1,1}};
		int[][]rot=rotate(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.print(rot[i][j]+"\t");
			System.out.print("\n");
			
		
		}
	}
}
