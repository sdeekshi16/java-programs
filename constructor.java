class rect
{
	double l;
	double b;
	rect()
	{
	   l=10;
	   b=20;
	}
	rect(double x,double y)
	{
	  
	  l=x;
	  b=y;
	}
	double area()
	{
		return l*b;
	}
}
class constructor
{
	public static void main(String args[])
	{
	  rect r=new rect(5,2);
	  double a=r.area();
	  System.out.println("area of rectangle is"+a);

	}
}