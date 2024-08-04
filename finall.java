class fig
{
	final int l=5;
    final int b=4;
    final void area()
    {
    	int a=l*b;
    	System.out.println("area:"+a);
	
    }
}
class rect extends fig
{
	final void rect()
	{
		System.out.println("this is rectangle");
	}

}
final public class finall 
{
	public static void main(String[] args) {
		rect obj=new rect();
		obj.rect();
		obj.area();
	}
}