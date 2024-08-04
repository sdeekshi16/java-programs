import java.util.Scanner;
class fibo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,a=0,b=1,c;
		System.out.println("enter the range");
		n=s.nextInt();
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		while(c<=n)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}

	}
}
