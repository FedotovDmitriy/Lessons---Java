package Beginer;

import java.util.Scanner;

public class l_1_2 {
	int x = 3;
	int y = 5;
	@SuppressWarnings("resource")
	public void ScanXandY()
	{
		System.out.print("Input first number :");
		Scanner scn = new Scanner(System.in);
		x = scn.nextInt();
		System.out.print("Input second number :");
		y = scn.nextInt();
		
		x = count(x);
		y = count(y);
	System.out.println(x+" "+y);
	}
	private static int count(int x)
	{
		x = x + 1;
		return x;
	}
}
