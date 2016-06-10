package Beginer;

import java.util.Random;

public class l_1_10 {
	public void treads()
	{
		Thread t1 = new Thread(new tread("1"));
		Thread t2 = new Thread(new tread("2"));
		Thread t3 = new Thread(new tread("3"));
		t1.start();
		t2.start();
		t3.start();
	}
	private class tread implements Runnable
	{
		int time;
		String name;
		Random r = new Random();
		public tread(String name)
		{
			this.name = name;
			time = r.nextInt(2000);
		}
		@Override
		public void run() {
			System.out.printf("Thread %s sleep %d\n", name,time);
			try{
				Thread.sleep(time);
			}catch(Exception e){}
			System.out.printf("Thread %s sleept, worked and finished\n", name);
		}
		
	}
}
