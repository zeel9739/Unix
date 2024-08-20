import java.util.Scanner;
class Palindrom
{
	public static void main(String args[])
	{
		System.out.print("Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer result = new StringBuffer();
		char ch[] = str.toCharArray();
		
		for(int i=(str.length()-1);i>=0;i--)
		{
			result.append(str.charAt(i));
		}
		
		String str2 = result.toString();
		if(str.equals(str2))
		{
			System.out.println("String Is Palindrom");
		}
		else
		{
			System.out.println("String Is Not Palindrom");
		}
	}
}
