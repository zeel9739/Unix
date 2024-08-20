import java.io.*;
import java.lang.*;

class Demothread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}
}
class sample
{
	public static void main(String args[])
	{
		Demothread d=new Demothread();
		d.start();
	}
}