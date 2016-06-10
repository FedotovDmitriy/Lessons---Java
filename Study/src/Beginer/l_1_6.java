package Beginer;
public class l_1_6 {
	public void printArrays()
	{
		int[] m = {1, 5, 9, 0, 8};
		int[] m1 = new int[5];
		for(int x = 0; x < 5; x++)
		{
			m1[x] = x;
			System.out.print(m1[x]);
			System.out.println(m[x]);
		}
	}
}
