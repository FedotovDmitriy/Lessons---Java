package Beginer;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class l_1_8 {
	static String[][] m = new String[6][3];
	static Scanner scn;
	public void readFromFile()
	{
		openFile();
		readFile();
		out();
	}
	private void out() {
		for(int row = 0 ; row < m.length ; row++)
		{
			for(int col = 0 ; col < m[row].length ; col++)
			{
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
	}
	private void readFile() {
		while(scn.hasNext())
		{
			for(int row = 0 ; row < m.length ; row++)
			{
				for(int col = 0 ; col < m[row].length ; col++)
				{
					try{
					m[row][col] = scn.next();
					}catch(Exception e){}
				}
			}
		}
	}
	private void openFile() {
		try{
			scn = new Scanner(new File("res//test2.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "File not founded");}
	}
}
