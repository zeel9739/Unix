import java.io.*;
import java.lang.*;

class Demothread extends Thread
{
	Thread t=new Thread();
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(t);
				t.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
class ThreadTryCatch
{
	public static void main(String args[])
	{
		Demothread d=new Demothread();
		d.start();
	}
}