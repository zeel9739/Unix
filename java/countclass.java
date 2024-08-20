package counter;

public class countclass
{
	int c=0;
	public int charcount(String str,char ch)
	{
		for (int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				c++;
			}
		}
		return c;
	}
}