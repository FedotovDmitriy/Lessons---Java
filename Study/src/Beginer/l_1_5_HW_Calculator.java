package Beginer;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Beginer.l_1_5_HW.eHandler;

public class l_1_5_HW_Calculator extends JFrame{
	cHandler handler = new cHandler();
	JButton bc = new JButton("Clean");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bminus = new JButton("-");
	JButton bplus = new JButton("+");
	JButton bdelit = new JButton("/");
	JButton bkefel = new JButton("*");
	JButton bcalculete = new JButton("=");
	JTextField t1 = new JTextField(20);
	JLabel l1 = new JLabel("");
	ArrayList<Integer> num1 = new ArrayList<Integer>();
	ArrayList<Integer> num2 = new ArrayList<Integer>();
	ArrayList<Integer> num = new ArrayList<Integer>();
	String x, y, siman, fnum, snum;
	boolean flag = false;
	public l_1_5_HW_Calculator(String s)
	{
		super(s);
		setLayout(new FlowLayout());
		add(t1); add(l1);add(bc);
		add(b1);add(b2);add(b3);
		add(b4);add(b5);add(b6);
		add(b7);add(b8);add(b9);
		add(b0);add(bplus);add(bminus);
		add(bdelit);add(bkefel);add(bcalculete);
		bc.addActionListener(handler);
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);
		b8.addActionListener(handler);
		b9.addActionListener(handler);
		b0.addActionListener(handler);
		bplus.addActionListener(handler);
		bminus.addActionListener(handler);
		bdelit.addActionListener(handler);
		bkefel.addActionListener(handler);
		bcalculete.addActionListener(handler);
	}
	public class cHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bc)
			{
				fnum = snum = x = y = "";
				num.clear(); num1.clear(); num2.clear();
				flag = false;
				t1.setText("");
				l1.setText("");
			}
				if(e.getSource() != bplus || e.getSource() != bminus ||
						e.getSource() != bdelit || e.getSource() != bkefel)
				{
					if(!flag)
					{
						num1 = addsNum(e.getSource(),num1);
						StringBuilder builder = new StringBuilder();
						for (int number : num1)
						    builder.append(number);
						fnum = builder.toString();
						t1.setText(fnum);
					}
					if(flag)
					{
						num2 = addsNum(e.getSource(),num2);
						StringBuilder builder = new StringBuilder();
						for (int number : num2)
						    builder.append(number);
						snum = builder.toString();
						t1.setText(fnum+" "+siman+" "+snum);
					}
				}
				if(e.getSource() == bplus || e.getSource() == bminus ||
						e.getSource() == bdelit || e.getSource() == bkefel)
				{
					siman = (e.getSource() == bplus ? "+" : (e.getSource() == bminus ? "-" : (
							e.getSource() == bkefel ? "*" : (e.getSource() == bdelit ? "/" : null))));
					t1.setText(fnum+" "+siman);
					flag = true;
				}
				if(e.getSource() == bcalculete)
				{
					t1.setText(fnum+" "+siman+" "+snum);
					l1.setText(calcul(Integer.parseInt(fnum),siman,Integer.parseInt(snum)));
				}
			}
		private ArrayList<Integer> addsNum(Object object,ArrayList<Integer> num) {
			if(object.equals(b1))num.add(1);
			if(object.equals(b2))num.add(2);
			if(object.equals(b3))num.add(3);
			if(object.equals(b4))num.add(4);
			if(object.equals(b5))num.add(5);
			if(object.equals(b6))num.add(6);
			if(object.equals(b7))num.add(7);
			if(object.equals(b8))num.add(8);
			if(object.equals(b9))num.add(9);
			if(object.equals(b0))num.add(0);
			return num;
		}
		private String calcul(int x,String sim,int y)
		{
			int result = 0;
			switch(sim)
			{
			case "+": 
				return Integer.toString(result = x + y);
			case "-": 
				return Integer.toString(result = x - y);
			case "*": 
				return Integer.toString(result = x * y);
			case "/": 
				return (y == 0 ? Integer.toString(result = 0) : Integer.toString(result = x / y));
			}
			return Integer.toString(result);
		}
		}	
	}