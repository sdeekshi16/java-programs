class a
{
	public void disp1()
	{
		System.out.println("hi");
	}
}
class b extends a 
{
	public void disp2()
	{
		System.out.println("hello");
	}
}
class c extends b
{
	public void disp3()
	{
		System.out.println("bonjour");
	}
}
class d extends b
{
	public void disp4()
	{
		System.out.println("hola");
	}
}
public class hybrid
{
	public static void main(String[] args) {
	
		c c=new c();
		d d=new d();
		c.disp1();
		c.disp2();
		c.disp3();
		d.disp4();
	}
}