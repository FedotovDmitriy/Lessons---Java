package Skilled;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class l_2_1_Server extends JFrame implements Runnable{

	static private ServerSocket server;
	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	JTextField t1;
	
	public l_2_1_Server(String str)
	{
		super(str);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		t1 = new JTextField(10);
		add(t1);
	}
	@Override
	public void run() {
		try {
			server = new ServerSocket(9419,10);
			while(true)
			{
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				try {
					t1.setText(("You sended:  "+(String)input.readObject()));
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					JOptionPane.showMessageDialog(null, (String)input.readObject());
				} catch (HeadlessException e) {e.printStackTrace();
				} catch (ClassNotFoundException e) {e.printStackTrace();}
			}
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}
	}
}
