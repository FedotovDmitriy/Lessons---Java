package Beginer;

import java.util.Formatter;
import java.util.Scanner;

public class l_1_9 {
	static Formatter x;
	static Scanner scn;
	public void formatter()
	{
		try{
			x = new Formatter("res//test3.txt");
			scn = new Scanner(System.in);
			System.out.println("How old are you?");
			int a = (int)Double.parseDouble(scn.next());
			System.out.println("What your name?");
			String b = scn.next();
			System.out.println("When you live?");
			String c = scn.next();
			x.format("My name %s, I %d old year and live in %s", b,a,c);
			x.close();
		}catch(Exception e){}
	}
}
