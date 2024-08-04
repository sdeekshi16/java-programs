class x
{
	void fun()
	{
		System.out.println("hi");
	}
}
class y extends x 
{
	void fun()
	{
		System.out.println("hlo");
	}
}
class z extends y 
{
	void fun()
	{
		System.out.println("hola");
	}
}
public class overriding
{
	public static void main(String[] args) {
		x x=new x();
		y y=new y();
		z z=new z();
		x.fun();
		y.fun();
		z.fun();

	}
}