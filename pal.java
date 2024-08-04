import java.io.*;
class pal
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int i,j,length,count=0;
	  String s;
	  System.out.println("enter any string:");
	  s=br.readLine();
	  length=s.length();
	  for(i=0,j=length-1;i<length/2;i++,j--)
	  {
	    if(s.charAt(i)!=s.charAt(j))
	    {
	      count=count+1;
	      break;
	    }
	  }
	  if(count==1)
	  {
	   System.out.println("string "+s+" is not a palindrome");
	  }
	  else
	  {
	   System.out.println("string "+s+" is  a palindrome");
	  }

	}
}