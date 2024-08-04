import java.util.Random;
class sqr implements Runnable
{
	int x;
	sqr(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("thread name: Sqr & sq of"+x+"is:"+x*x);
	}
}
class cube implements Runnable
{
	int x;
	cube(int x)
	{
		this.x=x;
	}
	public void run()
	{
		System.out.println("thread name: cube & cube of"+x+"is:"+x*x*x);
	}
}
class randomthread implements Runnable
{
	Random r;
	Thread t2,t3;
	public void run()
	{
		int num;
		r=new Random();
		try 
		{
			num=r.nextInt(100);
			System.out.println("main thread & generated no is "+num);
			t2=new Thread(new sqr(num));
			t2.start();
			t3=new Thread(new cube(num));
			t3.start();
			Thread.sleep(500);
			System.out.println(" ");
		}
		catch(Exception e)
		{
			System.out.println("Interrupted Exception");
		}
	}
}
public class mulThread
{
	public static void main(String args[])
	{
		randomthread rt=new randomthread();
		Thread t1=new Thread(rt);
		t1.start();
	}
}