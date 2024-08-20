import java.io.*;
import java.lang.*;

class Demothread implements Runnable
{
	public void run()
	{
		System.out.println("I am Run!!");
	}
}
class SampleThreadInterface
{
	public static void main(String args[])
	{
		Demothread d=new Demothread();
		Thread t=new Thread(d);
		t.start();
	}
}