package Tester;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Address {

	public void getMyIp() throws UnknownHostException
	{
		InetAddress IP = InetAddress.getLocalHost();
		System.out.println("IP of my system is := "+IP.getHostAddress());
	}
	public void getMyPort() throws IOException
	{
		ServerSocket s = new ServerSocket(0);
		System.out.println("listening on port: " + s.getLocalPort());
	}
}
