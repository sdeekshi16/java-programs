class outer
{
	void disp(int a,int b)
	{
		class inner
		{
			 void add(int x,int y)
			{
				int z=x+y;
				System.out.println("sum is:"+z);
			}
		}
		inner in=new inner();
		in.add(a,b);
	}
}
public class innerclass
{
	public static void main(String[] args) {
		outer o=new outer();
		o.disp(10,20);
	}
}