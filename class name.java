class name
{
	String first,last;
	name(String f,String l)
	{
	   this.first=f;
	   this.last=l;
	}
}
public class stu
{
	int age;
	name n;
	void disp(int age,name n)
	{
		System.out.println("age:"+age);
		System.out.println("Full name:"+n.first+" "+n.last);
	}
	public static void main(String args[])
	{
       name n= new name("harry","styles");
       stu s=new stu();
       s.disp(20,n);
	}
}