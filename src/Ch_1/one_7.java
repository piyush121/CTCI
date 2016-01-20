package ch_1;

public class one_7 {
	
	public static void setZeros(int[][] matrix) 
	{
		int row = matrix.length;	
		int column = matrix[0].length;
		boolean[][] mybool=new boolean[row][column];
		
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				mybool[i][j]=true;
				
		for(int i=0;i<row;i++)
			for(int j=0;j<column;j++)
				if(matrix[i][j]==0 && mybool[i][j]==true)
					{	
					for (int k=0;k<column;k++)
						{
							matrix[i][k]=0;
							mybool[i][k]=false;
						}
					for (int k=0;k<row;k++)
						{
							matrix[k][j]=0;
							mybool[k][j]=false;
						}
					}
		
	}
	
	public static void main(String[] args) {
		int[][] arr={{1,1,1,1},{1,0,1,1},{1,1,1,1}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.print("\n");
		}
		setZeros(arr);
		System.out.print("\n");

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.print("\n");
			
		
		}
	}
}
