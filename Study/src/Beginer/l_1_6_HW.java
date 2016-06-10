package Beginer;

public class l_1_6_HW {
	public void printArraysHW()
	{
		int[] matrix = new int[6];
		int i, m ;
		int z = 1;
		for(i = 0; i < 3 ; i++ )
		{
			matrix[i] = z++;
			System.out.print(matrix[i]);
		}
		System.out.print(" : ");
		for(m = i-1; i < 6 ; i++, m--)
		{
			matrix[i] = 0 - matrix[m];
			System.out.print(matrix[i]);
		}
	}
}
