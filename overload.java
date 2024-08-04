class mo
{
	int sum(int a,int b)
	{
		int s=0;
		s=a+b;
		return s;
	}
	int sum(int a,int b,int c)
	{
		int s=0;
		s=a+b+c;
		return s;
	}
	int sum(int a,int b,int c,int d)
	{
		int s=0;
		s=a+b+c+d;
		return s;
	}
}
public class overload
{
	public static void main(String args[])
	{
		mo m=new mo();
		int result=0;
		result=m.sum(1,2);
		System.out.println("sum is "+result);
		result=m.sum(1,2,3);
		System.out.println("sum is "+result);
		result=m.sum(1,2,3,4);
		System.out.println("sum is "+result);
	}
}