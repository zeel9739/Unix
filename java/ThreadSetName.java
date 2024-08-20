import java.io.*;
import java.lang.*;

class Demothread extends Thread
{
	Thread t=new Thread();
	public void run()
	{
		System.out.println(t);
		t.setName("zeel");
		System.out.println(t);
	}
}
class ThreadSetName
{
	public static void main(String args[])
	{
		Demothread d=new Demothread();
		d.start();
	}
}