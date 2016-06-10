package Beginer;

public class l_1_7 {
	int[][] m = {{1,2,3},{4,5,6},{9,7,8}};
	public void printBigArrays()
	{
		for(int row = 0 ; row < m.length ; row++)
		{
			for(int col = 0; col < m[row].length ; col++)
			{
				System.out.print(m[row][col]+" ");
				try{
					Thread.sleep(1500);
				}catch(Exception e){}
			}
			System.out.println();
		}
	}
}
