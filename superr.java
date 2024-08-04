class animal
{
	void eat()
	{
		System.out.println("animal eating..");
	}
}
class dog extends animal
{
	void eat()
	{
		System.out.println("dog eating..");
	}
	void bark()
	{
		System.out.println("dog barking..");
	}
	void work()
	{
		super.eat();
		bark();
	}
}
class superr
{
	public static void main(String[] args) {
		dog d=new dog();
		d.work();
	}
}