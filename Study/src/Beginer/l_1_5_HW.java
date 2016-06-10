package Beginer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class l_1_5_HW extends JFrame{
	JButton b1;
	JButton b2;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JTextField t1;
	JTextField t2;
	String s1,s2;
	int i, y;
	eHandler handler = new eHandler();
	
	public l_1_5_HW(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Clean");
		b2 = new JButton("Calculate");
		l1 = new JLabel("Your Age");
		l2 = new JLabel("You Date of born");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(t1);
		add(l1);
		add(t2);
		add(l2);
		add(b1);
		add(b2);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
	}
	public class eHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b2)
			{
				i = Integer.parseInt(t1.getText());
				t2.setText(getDate(i));
			}
			if(e.getSource() == b1)
			{
				t1.setText(null);
				t2.setText(null);
			}
		}
		
		private String getDate(int i) {
			int curdate;
			DateFormat dateFormat = new SimpleDateFormat("yyyy");
			Calendar cal = Calendar.getInstance();
			String dateInString = dateFormat.format(cal.getTime());
			System.out.println(dateInString);
			curdate = (Integer.parseInt(dateInString) - i);
			return Integer.toString(curdate);
		}
	}
}
