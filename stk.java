import java.util.StringTokenizer;
import java.io.*;
class stk
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter any string with @ delimiter:");
	  String in=br.readLine();
	  int sum=0;
	  StringTokenizer st=new StringTokenizer(in,"@");
	  while(st.hasMoreTokens())
	  {
	    int key=Integer.parseInt(st.nextToken());
	    sum+=key;
	    System.out.println(key);
	  }
	  System.out.println("sum is "+sum);
	}
}