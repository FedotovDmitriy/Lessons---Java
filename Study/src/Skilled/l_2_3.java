package Skilled;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class l_2_3 {
	
	private static ArrayList<l_2_3_Profile> profiles = new ArrayList<l_2_3_Profile>();
	
	public void ArrayProfile()
	{
		profiles = (ArrayList<l_2_3_Profile>) deserData("profiles");
		System.out.println(profiles.size());
		l_2_3_Profile profile = new l_2_3_Profile();
		profile.setName(JOptionPane.showInputDialog(null, "Input your name"));
		profile.setSurname(JOptionPane.showInputDialog(null, "Input your family"));
		profiles.add(profile);
		for(l_2_3_Profile p : profiles)
		{
			System.out.println(p.getName()+" "+p.getSurname());
		}
		System.out.println(profiles.size());
		serData("profiles", profiles);
	}

	private void serData(String file_name, Object obj) {
		try {
		try{
			FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			fileOut.close();
			out.close();
		    } catch (FileNotFoundException e) {System.out.println("File not founded"); System.exit(1);}
			} catch (IOException e) {System.out.println("Error of Input/Output");System.exit(2);}
	}

	private Object deserData(String file_name) {
		Object retObject = null;
		try {
			try{
				FileInputStream fileIn = new FileInputStream(file_name+".ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				try {
					retObject = in.readObject();
				} catch (ClassNotFoundException e) {System.out.println("Class no founded");System.exit(3);
				}
				fileIn.close();
				in.close();
			    } catch (FileNotFoundException e) {System.out.println("File not founded"); System.exit(1);}
				} catch (IOException e) {System.out.println("Error of Input/Output");System.exit(2);}
		return retObject;
	}
}
