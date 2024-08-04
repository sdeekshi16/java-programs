class pc
{
	public static void main(String args[])
	{
		producer p1=new producer();
		consumer c1=new consumer(p1);
		Thread t1=new Thread(p1);
		Thread t2=new Thread(c1);
		t2.start();
		t1.start();
	}
}
class producer extends Thread
{
	StringBuffer sb;
	producer()
	{
		sb=new StringBuffer();
	}
	public void run()
	{
		synchronized(sb)
		{
			for(int i=0;i<=10;i++)
			{
				try
				{
					sb.append(i+":");
					Thread.sleep(1000);
					System.out.println("appending");
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
			sb.notify();
		}
	}
}
class consumer extends Thread
{
	producer prod;
	consumer(producer prod)
	{
		this.prod=prod;
	}
	public void run()
	{
		synchronized(prod.sb)
		{
			try
			{
				prod.sb.wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(prod.sb);
		}
	}
}