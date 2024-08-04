import java.util.*;
public class arrlist
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList<String>b=new ArrayList<String>();
		a.add(10);
		a.add(20);
		b.add("apple");
		b.add("ball");
		b.add("cat");
		a.addAll(b);
		System.out.println("elements of a:"+a);
		System.out.println("search for apple:"+a.contains("apple"));
		System.out.println("check whether a & b are equal:"+a.equals(b));
		System.out.println("check whether a is empty:"+a.isEmpty());
		System.out.println("size of a:"+a.size());
		System.out.println("hashcode of a:"+a.hashCode());
		a.remove(0);
		System.out.println(a);
		a.retainAll(b);
		System.out.println(a);
		a.removeAll(b);
		System.out.println(a);
		b.clear();
		System.out.println(b);
	}
}