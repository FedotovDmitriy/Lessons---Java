package Skilled;

import java.util.ArrayList;
import java.util.Random;

public class l_2_2 {
	private static String[][] mobile = {
			{"Iphone", "0508284800"},
			{"Iphone", "0508284801"},
			{"Iphone", "0508284802"}
	};
	private static l_2_2_Mobile[] mobiles = new l_2_2_Mobile[3];
	private static ArrayList<l_2_2_Mobile> mobilesArray = new ArrayList<l_2_2_Mobile>();
	public void Arrays()
	{
		for(int i = 0 ; i < mobile.length; i++)
		{
			for(int k = 0 ; k < mobile[i].length; k++)
			{
				System.out.println(mobile[i][k]);
			}
		}
	}
	public void ArrayOfMobiles()
	{
		mobiles[0] = new l_2_2_Mobile(508284800, "Galaxy");
		mobiles[1] = new l_2_2_Mobile(508284801, "Galaxy");
		mobiles[2] = new l_2_2_Mobile(508284802, "Galaxy");
		
		for(l_2_2_Mobile m : mobiles)
		{
			System.out.println(m.getName()+" "+m.getNumber());
		}
	}
	private static Random r = new Random();
	public void ArraylistOfMobiles()
	{
		for(int i = 0 ; i < 10; i++)
		{
			mobilesArray.add(new l_2_2_Mobile(r.nextInt(99999999), "LG"));
		}
		for(l_2_2_Mobile m : mobilesArray)
		{
			System.out.println(m.getName()+" "+m.getNumber());
		}
	}
}
