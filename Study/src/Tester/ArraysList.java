package Tester;

import java.util.ArrayList;

public class ArraysList {

	private static ArrayList<Numbers> arrOfNumbers = new ArrayList<Numbers>();
	
	public void addNumsToArray(int x)
	{
		for(int i = 1 ; i <= x ; i++) // Add numbers 1 -> x
		{
			arrOfNumbers.add(new Numbers(i));
		}
		printArray();
	}
	public void deleteOneNumFromArray(int x)
	{
		arrOfNumbers.remove(x);
		printArray();
	}
	private static void printArray()
	{
		for(Numbers n : arrOfNumbers) // Print numbers of collection
		{
			System.out.print(n.getNumber()+" ");
		}
		System.out.print("  -  ");
		System.out.println("["+arrOfNumbers.size()+"]");
	}
}
