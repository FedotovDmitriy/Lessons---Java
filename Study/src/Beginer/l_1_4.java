package Beginer;

import javax.swing.JOptionPane;

public class l_1_4 {
	int m, n;
	String s1, s2;
	public void ScanFromGui()
	{
		s1 = JOptionPane.showInputDialog("Input first number : ");
		s2 = JOptionPane.showInputDialog("Input second number : ");
		m = Integer.parseInt(s1);
		n = Integer.parseInt(s2);
	}
	public void printToGui(int a, int b)
	{
		JOptionPane.showMessageDialog(null, "Your first number grow to "+a+3);
		JOptionPane.showMessageDialog(null, "Your second number grow to "+b+3);
	}
}
