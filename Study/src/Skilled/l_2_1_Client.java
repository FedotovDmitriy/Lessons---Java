package Skilled;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class l_2_1_Client extends JFrame implements Runnable {

	static private Socket connection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	JTextField t1;
	JButton b1;
	
	public static void main(String[] args) {
		new Thread(new l_2_1_Client("Test")).start();
		new Thread(new l_2_1_Server("Server")).start();
	}
	
	public l_2_1_Client(String name)
	{
		super(name);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		t1 = new JTextField(10);
		b1 = new JButton("Send");
		b1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(arg0.getSource() == b1)
						{
							sendData(t1.getText());
						}
						
					}
				});
		add(t1);
		add(b1);
	}

	@Override
	public void run() {
		try {
			while(true)
			{
				connection = new Socket(InetAddress.getByName("10.0.0.5"), 9419);
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				try {
					JOptionPane.showMessageDialog(null, (String)input.readObject());
				} catch (HeadlessException e) {e.printStackTrace();
				} catch (ClassNotFoundException e) {e.printStackTrace();}
			}
		} catch (UnknownHostException e) { e.printStackTrace();
		} catch (IOException e) {e.printStackTrace();}
	}

	private static void sendData(Object obj)
	{
		try {
			output.flush();
			output.writeObject(obj);
		} catch (IOException e) {e.printStackTrace();}
	}
}
