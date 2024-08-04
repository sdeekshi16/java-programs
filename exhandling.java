class exhandling
{
	public static void main(String[] args) 
	{
		int a=40,b=4,c=4;
		int result;
		try 
		{
			result=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divided by zero"+e);
		}
		finally
		{
			System.out.println("finally block");
		}
		result=a/(b+c);
		System.out.println("result:"+result);
	}
}