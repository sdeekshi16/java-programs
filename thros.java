import java.util.Scanner;
public class thros
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter 1st no ");
		int x=s.nextInt();
		System.out.print("enter 2nd no ");
		int y=s.nextInt();
		try
		{
			new thros().div(x,y);
		}
		catch(Exception e)
		{
			System.out.print("pgm ending");
		}

	}
	public void div(int a,int b) throws Exception
	{
		float result=a/b;
		System.out.print("division of "+a+"/"+b+"="+result);
	}
 
}