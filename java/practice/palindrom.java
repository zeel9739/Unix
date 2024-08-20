import java.util.Scanner;
class Palindrom
{
	public static void main(String args[])
	{
		System.out.println("Enter String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer r=new StringBuffer();
		char ch[] = str.toCharArray();

		for(int i=(str.length()-1);i>=0;i--)
		{
			r.append(str.charAt(i));
		}

		String str1=r.toString();

		if (str.equals(str1)) 
		{
			System.out.println("String is palindrom!");
		}
		else
		{
			System.out.println("String is Not palindrom!");	
		}
	}
}